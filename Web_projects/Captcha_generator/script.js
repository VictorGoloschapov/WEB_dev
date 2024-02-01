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
    captchaInputBox.value = "";
    captchaKeyUpValidate();
};

let captchaKeyUpValidate = () => {
    submitButton.classList.toggle("disabled", !captchaTextBox.value);

    if (captchaInputBox.value == "") {
        message.classList.remove("active");
    }
};

//validate entered captcha
let submitBtnClick = () => {
    //join the letter in array, remove blanks in string
    captchaText = captchaText.split("")
    .filter(char => char !== " ")
    .join("");

    message.classList.add("active");
    if (captchaInputBox.value == captchaText) {
        message.textContent = "Entered captcha is correct";
        message.style.color = "#826afb";
    } else {
        message.textContent = "Entered captcha is not correct";
        message.style.color = "#ff2525";
    }
};

//add event listener to refresh button, captchaInputBox
refreshButton.addEventListener("click", refreshButtonClick);
captchaInputBox.addEventListener("keyup", captchaKeyUpValidate);
submitButton.addEventListener("click", submitBtnClick);

//Generates captcha when page will load
generateCaptcha();

