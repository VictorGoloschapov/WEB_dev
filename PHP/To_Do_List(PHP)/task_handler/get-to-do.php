<?php
/* Fetch data */
function getTask()
{
    global $conn;
    $data['data'] = [];
    $query  = "SELECT id, task_name ";
    $query .= "FROM tasks ORDER BY id DESC";
    $result = $conn->query($query);

    if ($result) {
        if($result->num_rows> 0) {
            $data['data'] = $result->fetch_all(MYSQLI_ASSOC);
        } else {
            echo $data['taskMessage'] = "Currently no active tasks";
        }
    }

    return $data;
}
?>