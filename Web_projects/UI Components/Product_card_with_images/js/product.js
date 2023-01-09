
if (createProductItemList()) {
    createProductItemList().forEach(el => {
        let currentProduct = el;//current product (<article>elem</article>)
        let imageSwitchItems = el.querySelectorAll(".image-switch__item");
        let imagePagination = el.querySelector(".image-pagination");

        createImagePaginationChange(currentProduct, imageSwitchItems, imagePagination);
    });
}

function createProductItemList() {
    let products = document.querySelectorAll(".product");//nodelist of product
    return products;
}

function createImagePaginationChange(currentProduct, imageSwitchItems, imagePagination) {
    if (imageSwitchItems.length > 1) {
        imageSwitchItems.forEach((el, index) => {
            addPaginationItemToList(el, index, imagePagination);
            makePaginationItemActive(el, currentProduct);
            makeFirstPaginationItemActive(el, currentProduct);
        });
    }
}

function addPaginationItemToList(el, index, imagePagination) {
    el.setAttribute("data-index", index);
    imagePagination.innerHTML += `<li class="image-pagination__item ${index == 0 ? "image-pagination__item--active" : ""}" data-index="${index}"></li>`;
}

function makePaginationItemActive(el, currentProduct) {
    el.addEventListener('mouseenter', (e) => {
        currentProduct.querySelectorAll('.image-pagination__item').forEach(el => {
            el.classList.remove("image-pagination__item--active");
        });
        currentProduct.querySelector(`.image-pagination__item[data-index="${e.currentTarget.dataset.index}"]`).classList.add("image-pagination__item--active");
    });
}

function makeFirstPaginationItemActive(el, currentProduct) {
    el.addEventListener('mouseleave', (e) => {
        currentProduct.querySelectorAll('.image-pagination__item').forEach(el => {
            el.classList.remove("image-pagination__item--active");
        });
        currentProduct.querySelector(`.image-pagination__item[data-index="0"]`).classList.add("image-pagination__item--active");
    });
}