<?php
    require_once "includes/config.php";
    require_once "includes/classes/FormSanitizer.php";
    require_once "includes/classes/Account.php";

    $account = new Account($con);

    if (isset($_POST["submitButton"])) {
        $firstName = FormSanitizer::sanitizeFormString($_POST["firstName"]);
        $lastName = FormSanitizer::sanitizeFormString($_POST["lastName"]);
        $username = FormSanitizer::sanitizeFormUsername($_POST["username"]);
        $email = FormSanitizer::sanitizeFormEmail($_POST["email"]);
        $email2 = FormSanitizer::sanitizeFormEmail($_POST["email2"]);
        $password = FormSanitizer::sanitizeFormPassword($_POST["password"]);
        $password2 = FormSanitizer::sanitizeFormPassword($_POST["password2"]);

        echo "Name: $firstName<br>";
        echo "Lastname: $lastName<br>";
        echo "email: $email<br>";
        echo "confirm email: $email2<br>";
        echo "Password: $password<br>";
        echo "confirm Password: $password2<br>";
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/style/style.css">
    <title>Welcome to VicFlix</title>
</head>
<body>
    <div class="signInContainer">
        <div class="column">
            <div class="column__logo">
                <a href="#">vicflix</a>
            </div>
            <div class="header">
                <h3 class="header__title">Sign Up</h3>
                <span>to continue to VicFlix</span>
            </div>
            <form method="POST">
                <input type="text" name="firstName" placeholder="First Name" required>
                <input type="text" name="lastName" placeholder="Last Name" required>
                <input type="text" name="username" placeholder="Username" required>
                <input type="email" name="email" placeholder="Email" required>
                <input type="email" name="email2" placeholder="Confirm Email" required>
                <input type="password" name="password" placeholder="Password" required>
                <input type="password" name="password2" placeholder="Confirm Password" required>
                <input type="submit" name="submitButton" value="submit">
            </form>
            <a href="login.php" class="signin_message">Already have an account? Sign in here</a>
        </div>
    </div>
</body>
</html>