
//var for car image slides
let audiA6Slides = document.getElementsByClassName("audiA6_slides"),
    bmw520Slides = document.getElementsByClassName("bmw520_slides"),
    bmw730Slides = document.getElementsByClassName("bmw730_slides"),
    mbS400Slides = document.getElementsByClassName("mb_s400_slides"),
    vwPassatSlides = document.getElementsByClassName("vw_passat_slides"),

//var for car image thumbnails
    audiA6ImgDemo = document.getElementsByClassName("audiA6_demo"),
    bmw520ImgDemo = document.getElementsByClassName("bmw520_demo"),
    bmw730ImgDemo = document.getElementsByClassName("bmw730_demo"),
    mbS400ImgDemo = document.getElementsByClassName("mb_s400_demo"),
    vwPassatImgDemo = document.getElementsByClassName("vw_passat_demo"),

    //Slide index 1-5
    slideIndex = 1;
//call functions to open image galery
showSlides(slideIndex, audiA6Slides, audiA6ImgDemo);
showSlides(slideIndex, bmw520Slides, bmw520ImgDemo);
showSlides(slideIndex, bmw730Slides, bmw730ImgDemo);
showSlides(slideIndex, mbS400Slides, mbS400ImgDemo);
showSlides(slideIndex, vwPassatSlides, vwPassatImgDemo);

//next, previous controls
function plusSlides(n, carSlide, dots) {
    showSlides(slideIndex +=n, carSlide, dots); //при клике на кнопку добавляем слайд
}

//thumbnail image controls
function currentSlide(n, carSlide, dots) {
    showSlides(slideIndex = n, carSlide, dots);
}

function showSlides(n, carSlide, dots) {
    let i;

    if (n > carSlide.length) {
        slideIndex = 1;
    }
    if (n < 1) {
        slideIndex = carSlide.length;
    }
    for (i = 0; i < carSlide.length; i++) {
        carSlide[i].style.display = "none";
    }
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    carSlide[slideIndex-1].style.display = "block";
    dots[slideIndex-1].className += " active";
}
