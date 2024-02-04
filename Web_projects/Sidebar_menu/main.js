//array of menu items
let sidebar = document.querySelector(".sidebar");
let sidebarClose = document.querySelector("#sidebar-close");
let menu = document.querySelector(".menu-content");
let menuItems = document.querySelectorAll(".submenu-item");
let subMenuTitles = document.querySelectorAll(".submenu .menu-title");

sidebarClose.addEventListener("click", () => {
    sidebar.classList.toggle("close");
});

//put evenlistener on each menu item
menuItems.forEach((item, index) => {
    item.addEventListener("click", () => {
        menu.classList.add("submenu-active");
        item.classList.add("show-submenu");
        menuItems.forEach((item2, index2) => {
            if (index !== index2) {
                item2.classList.remove("show-submenu");
            }
        });
    });
});

subMenuTitles.forEach((title) => {
    title.addEventListener("click", () => {
        menu.classList.remove("submenu-active");
    });
});