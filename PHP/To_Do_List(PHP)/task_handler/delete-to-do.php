<?php
function deleteTask() {
    global $conn;
    $data  = [];

    if (isset($_GET['delete-task']) && !empty($_GET['delete-task'])) {
        $id = $_GET['delete-task'];

        $query = "DELETE FROM tasks ";
        $query .= "WHERE id=$id";
        $result = $conn->query($query);
        $data = $result->fetch_assoc();

    }

    return $data;
}
?>