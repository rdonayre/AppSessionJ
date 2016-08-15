/**
 * @author jbarnaby
 */

var Tree_img_plus = 'images/bullet_toggle_plus.gif';
var Tree_img_minus = 'images/bullet_toggle_minus.gif';
var Tree_img_folder = 'images/folder.gif';
var Tree_img_spacer = 'images/spacer.gif';

//$(document).ready(Tree_init);

function Tree_init() {
	tree = $('ul.tree');
	$('li.treeItem', tree.get(0)).each(
		function()
		{
			subbranch = $('ul', this);
			$(this).prepend('<img src="' + Tree_img_folder + '" class="folderImage" />');
			if (subbranch.size() > 0) {
				if (subbranch.eq(0).css('display') == 'none') {
					$(this).prepend('<img src="' + Tree_img_plus + '" width="16" height="16" class="expandImage" />');
				} else {
					$(this).prepend('<img src="' + Tree_img_minus + '" width="16" height="16" class="expandImage" />');
				}
			} else {
				$(this).prepend('<img src="' + Tree_img_spacer + '" width="16" height="16" class="expandImage" />');
			}
		}
	);
	$('img.expandImage', tree.get(0)).click(
		function()
		{
			if (this.src.indexOf('spacer') == -1) {
				subbranch = $('ul', this.parentNode).eq(0);
				if (subbranch.css('display') == 'none') {
					subbranch.show();
					this.src = Tree_img_minus;
				} else {
					subbranch.hide();
					this.src = Tree_img_plus;
				}
			}
		}
	);
	
	/* Expand Collapse buttons */
	$("a.tree").click(
		function()
		{
			Tree_expandcollapse(this.href);
			this.blur();
			return false;
		}
	);
}

function Tree_expandcollapse(url) {
	try {
		var queryString = url.replace(/^[^\?]+\??/,'');
		var params = JQ_parseQuery( queryString );
		tree = $('ul#' + params['id']);
		$('li', tree).each(
			function()
			{
				subbranch = $('ul', this);
				if (url.indexOf('Tree_expand') != -1) {
					subbranch.show();
					$('img.expandImage', this).each(
						function()
						{
							if (this.src.indexOf(Tree_img_plus) != -1) {
								this.src = Tree_img_minus;
							}
							return false;
						}
					)
				} else if(url.indexOf('Tree_collapse') != -1) {
					$('img.expandImage', this).each(
						function()
						{
							if (this.src.indexOf(Tree_img_minus) != -1) {
								this.src = Tree_img_plus;
							}
							return false;
						}
					)
					subbranch.hide();
				}
			}
		);
	} catch (e) {
		alert( e );
	}
}