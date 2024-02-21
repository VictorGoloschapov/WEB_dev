<div class="watch_container">
    <div class="video_controls watch_nav">
        <button>
            <i class="fa-solid fa-arrow-left"></i>
        </button>
        <h1><?php echo $video->getTitle(); ?></h1>
    </div>
    <video controls autoplay>
        <source src="<?php echo $video->getFilePath(); ?>" type="video/mp4">
    </video>
</div>
<script>
    initVideo("<?php echo $video->getId() ?>", "<?php echo $userLoggedIn ?>")

    function initVideo(videoId, username) {
        console.log(videoId);
        console.log(username);
        startHideTimer();
        updateProgressTimer(videoId, username);

    }

    function updateProgressTimer(videoId, username) {
        addDuration(videoId, username);
    }

    function addDuration(videoId, username) {
        $.post("ajax/add_duration.php", function(data) {
            console.log(data);
        })
    }

    function startHideTimer() {
        let timeout = null;

        //moving mouse arround the document page, do code in function
        $(document).on("mousemove", function() {
            clearTimeout(timeout); //clear timer when mouse is moving
            $(".watch_nav").fadeIn();
            timeout = setTimeout(function() {
                $(".watch_nav").fadeOut();
            }, 2000);
        })
    }
</script>