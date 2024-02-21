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
    initVideo();

    function initVideo() {
        startHideTimer();
    }

    function startHideTimer() {
        let timeout = null;

        console.log(timeout);

        //moving mouse arround the document page, do code in function
        $(document).on("mousemove", function() {
            clearTimeout(timeout); //clear timer when mouse is moving
            console.log($(".watch_nav"));
            $(".watch_nav").fadeIn();
            timeout = setTimeout(function() {
                $(".watch_nav").fadeOut();
            }, 2000);
        })
    }
</script>