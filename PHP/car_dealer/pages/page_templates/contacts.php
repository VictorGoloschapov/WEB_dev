<main class="main">
    <div class="container">
      <div class="car_order_intro">
        <h1 class="car_order_intro_title">Kā pasūtīt auto?</h1>
        <div class="car_order_intro_text">
          <p>
            <span>Atradīsim</span><br>Tev automašīnu, kas būs saskaņā ar Tavām prasībām un vēlmēm, sākot no markas un modeļa, līdz pat detalizētas auto komplektācijas izvēlei. Mēs sadarbojamies tikai ar pārbaudītiem un uzticamiem partneriem Latvijā un citās Eiropas valstīs, tāpēc Tev piedāvāsim tikai drošas un kvalitatīvas automašīnas, ar apstiprinātu servisa un nobraukuma vēsturi.
          </p>
        </div>
        <div class="car_order_intro_text">
          <p>
            <span>Pārbaudīsim</span><br>Tavu jauno automašīnu AutoUnit SIA autoservisā atbilstoši augstākajiem kvalitātes standartiem. Tikai tad, kad būsim pārliecinājušies, ka Tavs auto ir lieliskā kārtībā, ļausim Tev sēsties pie auto stūres.
          </p>
        </div>
        <div class="car_order_intro_text">
          <p>
            <span>Piegādāsim</span><br>Tavu jauno automašīnu jau reģistrētu CSDD un ar derīgu tehnisko apskati. Mums rūp Tava drošība, tāpēc pirms automašīnas nodošanas uzstādīsim nepieciešamo drošības aprīkojumu – kvalitatīvas un sezonai atbilstošas riepas un signalizāciju. Lai atvieglotu Tava sapņu auto iegādes procesu, piedāvāsim Tev izdevīgākos līzinga finansējuma risinājumus un labākos nosacījumus apdrošināšanai.
          </p>
        </div>
      </div><!--/.car_order_intro-->
      <div class="car_order_form">
        <h1 class="car_order_form_title">Pasūtīt auto</h1>
        <h2 class="car_order_form_subtitle">Esi gatavs savam sapņu auto? Dod mums uzdevumu uzsākt Tava jaunā auto meklējumus!
        </h2>
        <form class="form" action="/" method="post">
          <label>Kontaktinformācija:</label>
          <div class="form-group">
              <input class="input" type="text" name="name" placeholder="Vārds" required pattern="^[а-яА-Яa-zA-Z ,.'-]+$">
          </div>
          <div class="form-group">
            <input class="input" id="email" type="email" name="email" placeholder="E-pasts" required pattern="^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$">
            <span class="error"></span>
          </div>
          <div class="form-group">
              <input class="input" type="tel" name="tel" placeholder="Telefons" required pattern="\+[0-9]{11}">
          </div>
          <label>Informācija par vēlamo automašīnu:</label>
          <div class="form-group">
            <input class="input" type="text" name="manufacturer" placeholder="Marka" required pattern="^[а-яА-Яa-zA-Z ,.'-]+$">
          </div>
          <div class="form-group">
            <input class="input" type="text" name="model" placeholder="Modelis" required pattern="([A-Za-z0-9])\w+">
          </div>
          <div class="form-group">
              <select class="select" name="type_of_car" id="">
                  <option disabled selected>Virsbūves tips</option>
                  <option value="apvidus">Apvidus</option>
                  <option value="hečbeks">Hečbeks</option>
                  <option value="kabriolets">Kabriolets</option>
                  <option value="kupeja">Kupeja</option>
                  <option value="minibus">Minibus</option>
                  <option value="minivens">Minivens</option>
                  <option value="universals">Universāls</option>
            </select>
          </div>
          <div class="form-group">
            <input class="input" type="number" name="year_of_reg" placeholder="Pirmā reģistrācija">
          </div>
          <div class="form-group">
            <input class="input" type="number" name="odometer" placeholder="Nobraukums, km">
          </div>
          <div class="form-group">
            <select class="select" name="engine_type" id="">
                <option disabled selected>Dzinēja tips</option>
                <option value="diesel">Dīzelis</option>
                <option value="petrol">Benzīns</option>
            </select>
          </div>
          <div class="form-group">
            <input class="input" type="number" name="engine_capacity" placeholder="Dzinēja tilpums, l">
          </div>
          <div class="form-group">
            <select class="select" name="transmission" id="">
                <option disabled selected>Transmissija</option>
                <option value="diesel">Automatiskā</option>
                <option value="petrol">Mehāniskā</option>
            </select>
          </div>
          <div class="form-group">
            <textarea class="textarea" name="text" placeholder="Teksts"></textarea>
          </div>
          <div class="form-group">
            <button id="btn-submit" class="btn btn-long" type="submit">Nosūtīt pieteikumu</button>
        </div>
        </form>
        <img class="car_order_form_img" src="img/car_order_from_v1.jpg" alt="">
      </div><!--/.car_order_form-->
    </div><!--/.container-->
  </main>