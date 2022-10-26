$(function() {
    let header = $("#header");
    let introH  = $("#intro").innerHeight();
    let scrollOffset = $(window).scrollTop();

    checkScroll(scrollOffset);
    $(window).on("scroll", function() {
        scrollOffset = $(this).scrollTop();
        checkScroll(scrollOffset);
    })

    function checkScroll(scrollOffset) {
        if(scrollOffset >= introH) {
            header.addClass("fixed");
        } else {
            header.removeClass("fixed");
        }
    }

    //smooth scroll
    $("[data-scroll]").on("click", function(event) {
        event.preventDefault();

        let $this = $(this),
            blockId = $(this).data("scroll");
        let blockOffset = $(blockId).offset().top;

        $this.addClass("active");

        $("html, body").animate({
            scrollTop: blockOffset
        }, 500);

        console.log(blockOffset);
    })

    //Burger menu
    $("#nav-toggle").on("click", function(event) {
        event.preventDefault();

        $(this).toggleClass("active");
        $("nav").toggleClass("active");
    });

    //accordion
    $("[data-collapse]").on("click", function(event) {
        event.preventDefault();

        let $this = $(this),
            blockId = $(this).data("collapse");

        $this.toggleClass("active");
    })

    //Slider
    $("[data-slider]").slick({
        infinite: true,
        fade: false,
        slidesToShow: 1,
        slidesToScroll: 1
    });
});