$(function() {
  let header = $("#header");
  let headerH = header.innerHeight();
  let scrollPos = $(window).scrollTop();/*позиция прокрутки от верха*/

  $(window).on("scroll", function() {
    scrollPos = $(this).scrollTop();
    
    if(scrollPos > headerH) {
      header.addClass("fixed");
    } else {
      header.removeClass("fixed");
    }
  })
})