let products = document.querySelectorAll(".product");


if (products) {
    products.forEach(el => {
        let imageSwitchItems = el.querySelectorAll(".image-switch__item");
        let imagePagination = el.querySelector(".image-pagination");

        //delete console.log after code finish and success test
        console.log(imageSwitchItems);
        console.log(imagePagination);

        if (imageSwitchItems.length > 1) {
            //delete console.log after code finish and success test
            console.log(imageSwitchItems.length);

            imageSwitchItems.forEach((el, index) => {
                el.setAttribute("data-index", index);
                imagePagination.innerHTML += `<li class="image-pagination__item" data-index="${index}"></li>`;
            });
        }
    });
}