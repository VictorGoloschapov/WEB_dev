<?php
//app/model/Database.php

class Database
{
    private static $instance = null;
    private $conn;
    private $host = 'localhost';
    private $user = 'root';
    private $password = 'Supertank20ss!';
    private $DbName = 'crm_for_telegram';

    //private чтобы не вызвать конструктор в другом месте
    private function __construct()
    {
        //объект подключения к базе данных
        $this->conn = new mysqli($this->host, $this->user, $this->password, $this->DbName);

        if ($this->conn->connect_error)
        {
            die("Connect failed: " . $this->conn->connect_error);
        }
    }

    //возврат объета класса "Database"
    public static function getInstance()
    {
        if (!self::$instance)
        {
            self::$instance = new Database(); // здесь объект Database
        }

        return self::$instance;
    }

    //возврат объета подключения к базе данных
    public function getConnection()
    {
        return $this->conn;
    }
}