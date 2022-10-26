$(function() {
    /*NAV Toggle on mobile
    ===============================*/
    let navToggle = $("#navToggle");
    let nav = $("#nav");
    console.log(nav);

    navToggle.on("click", function(event) {
        event.preventDefault();

        /*при клике на меню делаем шапку черной*/
        $("body").toggleClass("show-nav");

        /*анимируем иконку меню(делаем крестик*/
        $(this).toggleClass("active");

        nav.toggleClass("show");
    })

    /*уберем меню при смене с портретной на горизонтальную ориентацию*/
    $(window).on("scroll resize", function() {
        $("body").removeClass("show-nav");
        navToggle.removeClass("active");
        nav.removeClass("show");

    })

    //переменные для фиксированной шапки
    //узнаем высоту блока
    let intro = $("#intro");
    let header = $("#header");
    let introH = intro.innerHeight(); //метод получения высоты блока
    let headerH = header.innerHeight();
    headerScroll();
    let scrollTop = $(window).scrollTop();


    /*Header class on scroll
    ===========================*/

    //при прокрутке будем получать размер экрана
    $(window).on("scroll resize", function() {
        headerScroll();
    })
    function headerScroll() {
       //перезапишем переменные
       introH = intro.innerHeight();
       headerH = header.innerHeight();

       /*при прокрутке получим позицию scroll и сравним с высотой блока intro
       когда позиця scroll == высоте intro присвоем intro позицию fixed
       */
       let scrollTop = $(this).scrollTop();

       if (scrollTop >= (introH - headerH)) {
           header.addClass("header--dark");//добавляем header--dark
       } else {
           header.removeClass("header--dark");//убираем header--dark
       }
    }

    /*smooth scroll to sections
    ==============================*/
    $("[data-scroll]").on("click", function(event) {
        event.preventDefault();
        let scrollEl = $(this).data("scroll");
        let scrollElPos = $(scrollEl).offset().top;

        /*Убераем меню при клике на ссылку, optional*/
        $("body").removeClass("show-nav");
        navToggle.removeClass("active");
        nav.removeClass("show");

        //плавная прокрутка страницы
        $("html, body").animate({
            scrollTop: scrollElPos - headerH //казали значение, на сколько прокрутить плавно
        }, 500 /*указали длительность прокрутки в мс*/)
    })

    /*Scroll spy
    ===========================*/
    let windowH = $(window).height();//высота окна
    scrollSpy(scrollTop)//вызывем функцию.

    //класс active не должен пропадать при перезагрузке страницы.
    $(window).on("scroll", function() {
        scrollTop = $(this).scrollTop();//позиция скрола страницы

        scrollSpy(scrollTop)//вызывем функцию.
    })

    function scrollSpy(scrollTop) {
        $("[data-scrollspy]").each(function() {//проходимся по всем секциям
            let $this = $(this);
            let sectionId = $this.data("scrollspy");
            let sectionOffset = $this.offset().top;//расстояние от верха страницы
            sectionOffset = sectionOffset - (windowH * 0.3333);

            if(scrollTop >= sectionOffset) {
                $('#nav [data-scroll]').removeClass("active");
                $('#nav [data-scroll="'+ sectionId + '"]').addClass("active");
            }
            if(scrollTop == 0) {//убираем active в самом верху страницы
                $('#nav [data-scroll]').removeClass("active");
            }
        })
    }

    /*Modal
    ===========================*/
    $("[data-modal]").on("click", function(event) {
        event.preventDefault(); //убераем стандартное поведенеие кнопки
        let modal = $(this).data("modal");//берем атрибут data-modal, пишем modal без data

        /*убераем scroll у body*/
        $("body").addClass("no-scroll");

        /*Покажем модальное окно*/
        $(modal).addClass("show");

        /*анимируем модальное окно - открытие*/
        setTimeout(function() {
            $(modal).find(".modal__content").css({
                transform: "translateY(0)",
                opacity: "1"
            });
        }, 200);
    });
    /*закрываем модальное окно*/
    $("[data-modal-close").on("click", function(event) {
        event.preventDefault();//отменили стандартное поведение

        let modal = $(this).parents(".modal");

        modalClose(modal);
    });

    $(".modal").on("click", function() {
        let modal = $(this)
        modalClose(modal);
    })
    /*отменяем закрытие окна при клике на содержимое модального окна*/
    $(".modal__content").on("click", function(event) {
        event.stopPropagation();
    })

    /*анимируем модальное окно - закрытие*/
    function modalClose(modal) {
        modal.find(".modal__content").css({
            transform: "translateY(-100px)",
            opacity: "0"
        });

        setTimeout(function() {
            $("body").removeClass("no-scroll");//возвращаем прокрутку body
            modal.removeClass("show");//скрываем модальное окно
        }, 200);
    }

    /*Slick Slider https://kenwheeler.github.io/slick/
    ============================*/
    /*reviews slider*/
    let reviewsSlider = $("#reviewsSlider");

    reviewsSlider.slick({
        infinite: true,
        slidesToShow: 1,
        slidesToScroll: 1,
        arrows: false,
        dots: true,
        speed: 500
    });

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
        offset: 80, // offset (in px) from the original trigger point
        delay: 0, // values from 0 to 3000, with step 50ms
        duration: 700, // values from 0 to 3000, with step 50ms
        easing: 'ease', // default easing for AOS animations
        once: false, // whether animation should happen only once - while scrolling down
        mirror: false, // whether elements should animate out while scrolling past them
        anchorPlacement: 'top-bottom', // defines which position of the element regarding to window should trigger the animation
    });

});



