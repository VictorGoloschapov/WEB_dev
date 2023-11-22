<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <title>To Do List</title>
</head>
<body>
    <div class="container my-5">
        <h1 class="text-center mb-5">To Do List</h1>
        <div class="row justify-content-center">
            <div class="col-sm-6">
                <?php
                include_once("db/db_connection.php");
                include_once("task_handler/to-do-form.php");
                include_once("task_handler/to-do-list.php");
                ?>
            </div>
        </div>
    </div>

    <script src = "script/main.js"></script>

</body>
</html>