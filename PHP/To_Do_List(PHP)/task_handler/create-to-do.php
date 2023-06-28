<?php

function createTask() {
    global $conn;

    if (isset($_POST['add'])) {
        $task = $_POST['task'];
        $data['taskMsg'] = '';

        if (empty($task)) {
            $data['taskMsg'] = "Empty Task Field!";
        }

        $validation = false;
        if(empty($data['taskMsg'])) {
            $validation = true;
        }

        if ($validation) {
            $query  = "INSERT INTO tasks";
            $query .= "(task_name) ";
            $query .= "VALUES ('$task')";

            $result = $conn->query($query);

            if ($result) {
                $data['success'] = "Task is added successfully";
            }
        }

        return $data;
    }
}
?>