<?php echo $account->getError(Constants::$firstNameCharacters);?>
<input type="text" name="firstName" placeholder="First Name" value="<?php getInputValue("firstName");?>" required>

<?php echo $account->getError(Constants::$lastNameCharacters);?>
<input type="text" name="lastName" placeholder="Last Name" value="<?php getInputValue("lastName");?>" required>

<?php echo $account->getError(Constants::$usernameCharacters);?>
<?php echo $account->getError(Constants::$usernameTaken);?>
<input type="text" name="username" placeholder="Username" value="<?php getInputValue("username");?>" required>

<?php echo $account->getError(Constants::$emailsDontMatch);?>
<?php echo $account->getError(Constants::$emailInvalid);?>
<?php echo $account->getError(Constants::$emailExists);?>
<input type="email" name="email" placeholder="Email" value="<?php getInputValue("email");?>" required>

<?php echo $account->getError(Constants::$emailsDontMatch);?>
<?php echo $account->getError(Constants::$emailInvalid);?>
<input type="email" name="email2" placeholder="Confirm Email" value="<?php getInputValue("email2");?>" required>

<?php echo $account->getError(Constants::$passwordsDontMatch);?>
<?php echo $account->getError(Constants::$passwordsLength);?>
<input type="password" name="password" placeholder="Password" required>
<input type="password" name="password2" placeholder="Confirm Password" required>
<input type="submit" name="submitButton" value="submit">