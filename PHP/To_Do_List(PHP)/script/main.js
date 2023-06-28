let parentElemContainer = document.querySelector("div.row");
parentElemContainer.addEventListener("click", function(e) {
    if (e.target.tagName === "I") {
        console.log("i clicked");
        let targetElem = e.target.closest('div');
        console.log(targetElem);

    }
});

// console.log(parentElemContainer);