let audiA6 = document.getElementById("audiA6_modal"),
    bmw520 = document.getElementById("bmw520_modal"),
    bmw730 = document.getElementById("bmw730_modal"),
    mbS400 = document.getElementById("mb_s400_modal"),
    vwPassat = document.getElementById("vw_passat_modal"),
    requestForm = document.getElementById("request_form");

//open modal with image gallery
function openModal(car) {
  car.style.display = "flex";
  document.body.classList.add("no-scroll");

  //click on window area to close modal
  window.onclick = function(event) {
    if (event.target == car) {
      car.style.display = "none";
      document.body.classList.remove("no-scroll");
    }
  }
}

//open modal with request form
function openRequestFormModal(carModal, requestModal) {
  carModal.style.display = "none";
  requestModal.style.display = "flex";

  window.onclick = function(event) {
    if (event.target == requestModal) {
      requestModal.style.display = "none";
      document.body.classList.remove("no-scroll");
    }
  }
}

//click on span(X) to close modal
function modalClose(car) {
  car.style.display = "none";
  document.body.classList.remove("no-scroll");
}
