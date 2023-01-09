let products = document.querySelectorAll(".product");

if (products) {
    products.forEach(el => {
        let imageSwitchItems = el.querySelectorAll("image-switch__item");
        let imagePagination = el.querySelectorAll(".image-pagination");

        imageSwitchItems.forEach((el, index) => {
            el.setAttribute("data-index", index);
        });
    });
}