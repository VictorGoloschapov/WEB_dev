let captchaTextBox = document.querySelector(".captch_box input");
let captchaInputBox = document.querySelector(".captch_input input");
let refreshButton = document.querySelector(".refresh_button");
let message = document.querySelector(".message");
let submitButton = document.querySelector(".button");

//varibale to store generated captcha
let captchaText = null;

//Generate captcha
let generateCaptcha = () => {
    let randomString = Math.random().toString(36).substring(2, 7);
    let randomStringArray = randomString.split("");
    let changeString = randomStringArray.map((char) => (Math.random() > 0.5 ? char.toUpperCase() : char));
    captchaText = changeString.join(" ");
    captchaTextBox.value = captchaText;
}

let refreshButtonClick = () => {
    generateCaptcha();
};

let captchaKeyUpValidate = () => {

};

//add event listener to refresh button, captchaInputBox
refreshButton.addEventListener("click", refreshButtonClick);
captchaInputBox.addEventListener("keyup", captchaKeyUpValidate);

//Generates captcha when page will load
generateCaptcha();

