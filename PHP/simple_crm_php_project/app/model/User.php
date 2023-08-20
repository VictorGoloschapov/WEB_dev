<?php

class User
{
    private $db;

    //автоматический connect к базе данных
    public function __construct()
    {
        $this->db = Database::getInstance()->getConnection(); //здесь connect с базой данных
    }

    //брать массив пользователей из базы данных
    public function readAll()
    {
        $sqlQuery = "SELECT * FROM users";
        $result = $this->db->query($sqlQuery); //обращаемся к базе данных и делаем запрос
        $users = [];

        //получаем массив построчно
        while($row = $result->fetch_assoc())
        {
            $users = $row;
        }

        return $users;
    }
}
?>