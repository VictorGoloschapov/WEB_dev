<?php

class Router
{
    public function run()
    {
        //получать адресную строку
        //если нет страницы, то открываем страницу Home

        if (!isset($_GET["page"])) //пока так оставить
        {
            $_GET["page"] = "users";
            header("Location: index.php?page=users");
        }

        $page = isset($_GET['page']) ? $_GET['page'] : 'home';

        echo $page . "<br>";
        echo var_dump($_GET) . "<br>";

        switch($page)
        {
            case 'users':
                $controller = new UsersController();
                $controller->index();
                break;
            default:
                http_response_code(404);
                echo "page not found";
                break;
        }
    }
}
?>