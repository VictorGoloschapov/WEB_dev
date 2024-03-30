<?php
require_once "data_config.php";
include_once "includes/pages_tpl/header.php";
?>

<div class="search_container">
    <div class="text_box_container">
        <input type="text" class="search_input" placeholder="Search for something">
    </div>
    <div class="results"></div>
</div>


<script>
    $(function() {
        let username = '<?php echo $userLoggedIn; ?>'; //string with a username
        let timer;

        $(".search_input").keyup(function() {
            clearTimeout(timer);

            timer = setTimeout(function() {
                let val = $(".search_input").val();

                if(val != "") {
                    $.post("ajax/get_search_result.php", {term: val, username: username}, function(data) {
                        $(".results").html(data);
                        console.log("works");
                    });
                } else {
                    $(".results").html("");
                }
            }, 500);
        });
    })
</script>

<?php include_once $tpl_footer; ?>

