<?php
function editTaskById(){
      global $conn;
      $data=[];

    if(isset($_GET['edit-task']) && !empty($_GET['edit-task']) ) {

        $id = $_GET['edit-task'];
        $msg = [];
        /* sql query*/
        $query = "SELECT task_name ";
        $query .= "FROM tasks ";
        $query .= "WHERE id=$id";
        $result = $conn->query($query);
        $data = $result->fetch_assoc();
    }

    // var_dump($data);
    return $data;
}
?>