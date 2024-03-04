<div class="watch_container">
    <div class="video_controls watch_nav">
        <button>
            <i class="fa-solid fa-arrow-left"></i>
        </button>
        <h1><?php echo $video->getTitle(); ?></h1>
    </div>
    <div class="video_controls up_next" style="display:none">
        <button><i class="fa-solid fa-redo"></i></button>
        <div class="up_next_container">
            <h2>Up next:</h2>
            <h3><?php echo $upNextVideo->getTitle() ?></h3>
            <h3><?php echo $upNextVideo->getSeasonAndEpisode() ?></h3>

            <button class="play_next">
                <i class="fa-solid fa-play"></i> Play
            </button>
        </div>
    </div>
    <video class="video_item" controls autoplay>
        <source src="<?php echo $video->getFilePath(); ?>" type="video/mp4">
    </video>
</div>
<script src="assets/js/video.js"></script>
<script>
    initVideo("<?php echo $video->getId() ?>", "<?php echo $userLoggedIn ?>");
    playNextButton.addEventListener("click", function() {
        watchVideo(<?php echo $upNextVideo->getId() ?>);
    });
</script>