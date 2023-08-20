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
//Пишем с нуля "Mini CRM system" на PHP8 & SQL используя ООП. Часть-1  49:37
?>