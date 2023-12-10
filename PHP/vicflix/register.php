<?php
    require_once "includes/pages_setup.php";

    if (isset($_POST["submitButton"])) {
        $firstName = FormSanitizer::sanitizeFormString($_POST["firstName"]);
        $lastName = FormSanitizer::sanitizeFormString($_POST["lastName"]);
        $username = FormSanitizer::sanitizeFormUsername($_POST["username"]);
        $email = FormSanitizer::sanitizeFormEmail($_POST["email"]);
        $email2 = FormSanitizer::sanitizeFormEmail($_POST["email2"]);
        $password = FormSanitizer::sanitizeFormPassword($_POST["password"]);
        $password2 = FormSanitizer::sanitizeFormPassword($_POST["password2"]);

        $success = $account->register($firstName, $lastName, $username, $email, $email2, $password, $password2);

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
    <div class="signInContainer">
        <div class="column">
            <div class="column__logo">
                <a href="#"><?=$site_logo?></a>
            </div>
            <div class="header">
                <h3 class="header__title"><?=$titles["register_form"]?></h3>
                <span>to continue to <?=$site_logo?></span>
            </div>
            <form method="POST">
                <?php include $tpl_registration_form?>
            </form>
            <a href="login.php" class="signin_message">Already have an account? Sign in here</a>
        </div>
    </div>