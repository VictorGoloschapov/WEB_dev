<?php
error_reporting(E_ALL);//вывод всех ошибок при отладке
ini_set("display_errors", 1);

//models
require_once 'app/model/Database.php';
require_once 'app/model/User.php';

//controllers
require_once 'app/controller/users/AuthController.php';
require_once 'app/controller/users/UsersController.php';
?>