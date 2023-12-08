<?php
    if (isset($_POST["submitButton"])) {
        var_dump($_POST);
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
                <h3 class="header__title">Sign In</h3>
                <span>to continue to VicFlix</span>
            </div>
            <form method="POST">
                <input type="text" name="username" placeholder="Username" required>
                <input type="password" name="password" placeholder="Password" required>
                <input type="submit" name="submitButton" value="submit">
            </form>
            <a href="register.php" class="signin_message">Don't have an account? Sign up here</a>
        </div>
    </div>
</body>
</html>