let parentElemContainer = document.querySelector("div.row");
let allertMessage = document.querySelector("#liveAlertPlaceholder");
let closeButton = document.querySelector(".btn-close");

parentElemContainer.addEventListener("click", function(e) {
    if (e.target.tagName === "I") {
        console.log("i clicked");
        let targetElem = e.target.closest('div');
        console.log(targetElem);

    }
});

if (allertMessage && closeButton) {
    closeButton.addEventListener("click", closeAlert);
}


function closeAlert() {
    allertMessage.classList.toggle("d-none");
}

// console.log(allertMessage);
// console.log(closeButton);

// // console.log(parentElemContainer);