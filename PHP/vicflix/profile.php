<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";

$detailsMessage = "";
$errorMessage = "";
$passwordMessage = "";

if (isset($_POST["saveDetailsButton"])) {
    $account = new Account($con);

    $firstName = FormSanitizer::sanitizeFormString($_POST["firstName"]);
    $lastName = FormSanitizer::sanitizeFormString($_POST["lastName"]);
    $email = FormSanitizer::sanitizeFormEmail($_POST["email"]);

    if ($account->updateDetails($firstName, $lastName, $email, $userLoggedIn)) {
        $detailsMessage = "<div class=\"alert_success\">
                                Details updated sucessfully!
                            </div>";
    } else {
        $errorMessage = $account->getFirstError();

        $detailsMessage = "<div class=\"alert_error\">
                                $errorMessage
                            </div>";
    }
}

if (isset($_POST["savePasswordButton"])) {
    $account = new Account($con);

    $oldPassword = FormSanitizer::sanitizeFormPassword($_POST["oldPassword"]);
    $newPassword = FormSanitizer::sanitizeFormPassword($_POST["newPassword"]);
    $newPassword2 = FormSanitizer::sanitizeFormPassword($_POST["newPassword2"]);

    if ($account->updatePassword($oldPassword, $newPassword, $newPassword2, $userLoggedIn)) {
        $passwordMessage = "<div class=\"alert_success\">
                                Password updated sucessfully!
                            </div>";
    } else {
        $errorMessage = $account->getFirstError();

        $passwordMessage = "<div class=\"alert_error\">
                                $errorMessage
                            </div>";
    }
}
?>

<div class="settings_container column">
    <div class="form_section">
        <form method="POST">
            <h2 class="form_section__title">User details</h2>

            <?php
                $user = new User($con, $userLoggedIn);
                $firstName = isset($_POST["firstName"]) ? $_POST["firstName"] : $user->getFirstName();
                $lastName = isset($_POST["lastName"]) ? $_POST["lastName"] : $user->getLastName();
                $email = isset($_POST["email"]) ? $_POST["email"] : $user->getEmail();
            ?>

            <input type="text" name="firstName" placeholder="First name" value="<?php echo $firstName; ?>">
            <input type="text" name="lastName" placeholder="Last name" value="<?php echo $lastName; ?>">
            <input type="email" name="email" placeholder="Email" value="<?php echo $email; ?>">

            <div class="message">
                <?php echo $detailsMessage; ?>
            </div>
            <input type="submit" name="saveDetailsButton" value="Save">
        </form>
    </div>

    <div class="form_section">
        <form method="POST">
            <h2 class="form_section__title">Update password</h2>
            <input type="password" name="oldPassword" placeholder="Old password">
            <input type="password" name="newPassword" placeholder="New password">
            <input type="password" name="newPassword2" placeholder="Confirm new password">

            <div class="message">
                <?php echo $passwordMessage; ?>
            </div>

            <input type="submit" name="savePasswordButton" value="Save">
        </form>
    </div>
</div>
