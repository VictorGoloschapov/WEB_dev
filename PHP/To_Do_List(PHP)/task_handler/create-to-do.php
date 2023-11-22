<?php

function createTask() {
    global $conn;

    if (isset($_POST['add'])) {
        $task = $_POST['task'];
        $data['taskMessage'] = '';

        if (empty($task)) {
            $data['taskMessage'] = "Empty Task Field!";
            $data['alertMsgStyle'] = "alert-danger";
        }

        $validation = false;
        if(empty($data['taskMessage'])) {
            $validation = true;
        }

        if ($validation) {
            $query  = "INSERT INTO tasks";
            $query .= "(task_name) ";
            $query .= "VALUES ('$task')";

            $result = $conn->query($query);

            if ($result) {
                $data['taskMessage'] = "Task is added successfully";
                $data['alertMsgStyle'] = "alert-success";
            }
        }

        // var_dump($data);
        return $data;
    }
}
?>