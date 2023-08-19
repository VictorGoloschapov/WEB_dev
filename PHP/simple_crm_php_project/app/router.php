<?php

class Router
{
    public function run()
    {
        //получать адресную строку
        //если нет страницы, то открываем страницу Home
        $page = isset($_GET['page']) ? $_GET['page'] : 'home';

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