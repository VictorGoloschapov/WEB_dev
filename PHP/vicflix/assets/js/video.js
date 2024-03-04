function initVideo(videoId, username) {
    startHideTimer();
    setStartTime(videoId, username);
    updateProgressTimer(videoId, username);

}

function updateProgressTimer(videoId, username) {
    addDuration(videoId, username);
    let timer;

    //save video playing progress
    $("video").on("playing", function(event){
        window.clearInterval(timer);//stop the timer
        timer = window.setInterval(function() {
            updateProgress(videoId, username, event.target.currentTime);
        }, 3000);
    })
    .on("pause", function() {
        window.clearInterval(timer);//stop the timer
    })
    .on("ended", function() {
        setFinished(videoId, username);
        window.clearInterval(timer);//stop the timer
    });
}

function addDuration(videoId, username) {
    $.post("ajax/add_duration.php", {"videoId": videoId, "username": username}, function(data) {
        if(data !== null && data !== "") {
            alert(data);
        }
    })
}

function updateProgress(videoId, username, progress) {
    console.log(progress);

    $.post("ajax/update_duration.php", {"videoId": videoId, "username": username, "progress": progress}, function(data) {
        if(data !== null && data !== "") {
            alert(data);
        }
    })
}

function setFinished(videoId, username) {
    $.post("ajax/set_finished.php", {"videoId": videoId, "username": username}, function(data) {
        if(data !== null && data !== "") {
            alert(data);
        }
    })
}

function setStartTime(videoId, username) {
    $.post("ajax/get_progress.php", {"videoId": videoId, "username": username}, function(data) {
        console.log(data);
        if (isNaN(data)) {
            alert(data);
            return;
        }

        console.log(data);

        $("video").on("canplay", function() {
            this.currentTime = data;
            $("video").off("canplay");
        });
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

//restart video
let restartButton = document.querySelector(".up_next button");
let playNextButton = document.querySelector(".up_next_container button");
let playButton = document.querySelector(".preview_overlay .buttons button");
let video = document.querySelector(".video_item");

restartButton.addEventListener("click", restartVideo);
video.addEventListener("ended", showUpNext);

function restartVideo() {
    $("video")[0].currentTime = 0; //js video object
    $("video")[0].play();
    $(".up_next").fadeOut();
}

function watchVideo(videoId) {
    window.location.href = "watch.php?id=" + videoId;
}

function showUpNext() {
    $(".up_next").fadeIn();
}