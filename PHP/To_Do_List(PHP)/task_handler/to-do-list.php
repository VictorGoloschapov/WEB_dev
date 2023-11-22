<?php
include('get-to-do.php');
$getTask = getTask();

?>
<?php
if(count($getTask['data'])) {
    foreach($getTask['data'] as $task) {
?>
        <div class="d-flex my-3">
            <div style="margin-right: 5px;" class="d-inline-block">
                <input type="checkbox" title="complete task">
            </div>
            <div class="col-sm-10">
                <?php
                echo $task['task_name'];
                ?>
            </div>
            <div class="col-sm-1">
                <a href="index.php?edit-task=<?php echo $task['id']; ?>" class="text-success text-decoration-none">
                <i class='fas fa-edit'></i></a>
            </div>
            <div class="col-sm-1">
                <a href="index.php?delete-task=<?php echo $task['id']; ?>" class="text-danger text-decoration-none">
                <i class='fas fa-trash-alt'></i></a>
            </div>
        </div>
        <hr>
<?php
    }
}
?>