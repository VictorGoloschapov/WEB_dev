$(function() {
    let header = $("#header");
    let introH  = $("#intro").innerHeight();
    let scrollOffset = $(window).scrollTop();
    
    /*Делаем шапку сайта фиксированой ри прокрутке сайта*/
    //header fixed
    checkScroll(scrollOffset);//вызов функции фиксации header
    /*если высота scroll выше высоты блока Intro (introH), то блоку header присваивается position: fixed*/
    $(window).on("scroll", function() {
        scrollOffset = $(this).scrollTop();
        checkScroll(scrollOffset);
    })
    
    function checkScroll(scrollOffset) {
        /*если scrollOffset больше introH, то у header fixed*/
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
            blockId = $(this).data("scroll");//храним ID блока на который будем ссылаться при прокрутке
        let blockOffset = $(blockId).offset().top; //сохранили позицию элемента от верха страницы
        
        //Придадим класс active для нажатой ссылки
        $this.addClass("active");
        
        //плавная прокрутка страницы
        $("html, body").animate({
            scrollTop: blockOffset//казали значение, на сколько прокрутить плавно
        }, 500/*указали длительность прокрутки в мс*/);
        
        console.log(blockOffset);
    })
    
    //Burger menu
    $("#nav-toggle").on("click", function(event) {
        event.preventDefault();
        
        $(this).toggleClass("active");
        $("nav").toggleClass("active");
    });
    
    //accordion
    //следим за кликом по атрибуту
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