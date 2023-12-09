<?php
    require_once "includes/setup.php";

    if (isset($_POST["submitButton"])) {
        $username = FormSanitizer::sanitizeFormUsername($_POST["username"]);
        $password = FormSanitizer::sanitizeFormPassword($_POST["password"]);

        $success = $account->login($username, $password);

        if ($success) {
            $_SESSION["userLoggedIn"] = $username;
            header("Location: index.php"); // if login/register succesfull - redirect to index page
        }
    }

    function getInputValue($name) {
        if (isset($_POST[$name])) {
            echo $_POST[$name];
        }
    }
?>

<?php include $tpl_header?>
<body>
    <div class="signInContainer">
        <div class="column">
            <div class="column__logo">
                <a href="#"><?=$site_logo?></a>
            </div>
            <div class="header">
                <h3 class="header__title"><?=$titles["login_form"]?></h3>
                <span>to continue to <?=$site_logo?></span>
            </div>
            <form method="POST">
                <?php include $tpl_login_form ?>
            </form>
            <a href="register.php" class="signin_message">Don't have an account? Sign up here</a>
        </div>
    </div>
</body>
</html>