<?php

//всегда подключаем файлы с классами, это как import в java
require_once "app/model/User.php";

class UsersController
{
    //вызов всех пользователей
    public function index()
    {
        $userModel = new User();
        $users = $userModel->readAll();

        include "app/views/users/index.php";
    }
}

?>