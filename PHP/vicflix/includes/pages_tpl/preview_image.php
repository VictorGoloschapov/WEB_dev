<div class="preview__container">
    <img class="preview__image" src="<?=$thumbnail?>" alt="preview image" hidden>
    <video autoplay muted class="preview__video" onended="previewEnded()">
        <source src=<?=$preview?> type="video/mp4">
    </video>

    <div class="preview_overlay">
        <div class="main_details">
            <h3 class="main_details__title"><?=$name?></h3>
            <h4 class="main_details__subtitle">some subtitle</h4>

            <div class="buttons">
                <button><i class="fa-solid fa-play"></i> Play</button>
                <button id="volume_btn"><i class="fa-solid fa-volume-xmark"></i></button>
            </div>
        </div>
    </div>
</div>


<script src="assets/js/main.js"></script> <!--keep here until footer will be created-->