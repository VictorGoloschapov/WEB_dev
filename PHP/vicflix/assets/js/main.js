let volumeBtn = document.getElementById("volume_btn");

volumeBtn.addEventListener("click", function() {
    volumeToggle(this);
});

function volumeToggle(button) {
    let muted = $(".preview__video").prop("muted");
    $(".preview__video").prop("muted", !muted);
    $(button).find("i").toggleClass("fa-volume-xmark");
    $(button).find("i").toggleClass("fa-volume-high");
}

function previewEnded() {
    //hide video or hide image
    $(".preview__video").toggle();
    $(".preview__image").toggle();
}