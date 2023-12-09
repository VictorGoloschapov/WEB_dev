<?php echo $account->getError(Constants::$loginFailed);?>
<input type="text" name="username" placeholder="Username" value="<?php getInputValue("username");?>" required>
<input type="password" name="password" placeholder="Password" required>
<input type="submit" name="submitButton" value="submit">