//scroll script for index.html

$(function () {
  //Nav toggle
  let navToggle = $("#navToggle"),
      nav = $("#nav");

  navToggle.on("click", function(event) {
    event.preventDefault();
    $("body").toggleClass("nav-noscroll");
    $(this).toggleClass("active");
    nav.toggleClass("show");
  })

  $(window).on("scroll resize", function() {
    nav.removeClass("show");
  })

  let header = $("#header");
  let intro = $("#intro");
  let introH = intro.innerHeight();/*метод покажет высоту блока без учета padding*/
  let scrollPos = $(window).scrollTop();/*позиция прокрутки от верха*/

  $(window).on("scroll", function() {
    scrollPos = $(this).scrollTop();

    if(scrollPos > introH) {
      header.addClass("fixed");
    } else {
      header.removeClass("fixed");
    }
  })

  /*анимированные блоки
    ================================*/
    /*aos.js
    https://michalsnik.github.io/aos/
    https://github.com/michalsnik/aos
    */

    AOS.init({
      // Global settings:
      disable: 'phone', // accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
      startEvent: 'DOMContentLoaded', // name of the event dispatched on the document, that AOS should initialize on
      initClassName: 'aos-init', // class applied after initialization
      animatedClassName: 'aos-animate', // class applied on animation
      useClassNames: false, // if true, will add content of `data-aos` as classes on scroll
      disableMutationObserver: false, // disables automatic mutations' detections (advanced)
      debounceDelay: 50, // the delay on debounce used while resizing window (advanced)
      throttleDelay: 99, // the delay on throttle used while scrolling the page (advanced)


      // Settings that can be overridden on per-element basis, by `data-aos-*` attributes:
      offset: 180, // offset (in px) from the original trigger point
      delay: 0, // values from 0 to 3000, with step 50ms
      duration: 700, // values from 0 to 3000, with step 50ms
      easing: 'ease', // default easing for AOS animations
      once: false, // whether animation should happen only once - while scrolling down
      mirror: false, // whether elements should animate out while scrolling past them
      anchorPlacement: 'top-bottom', // defines which position of the element regarding to window should trigger the animation
  });

});