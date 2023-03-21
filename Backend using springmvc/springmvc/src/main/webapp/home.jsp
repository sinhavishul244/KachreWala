<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kachrewala</title>

    <!-- favicon -->
    <link
        href="data:image/x-icon;base64,AAABAAEAEBAAAAAAAABoBQAAFgAAACgAAAAQAAAAIAAAAAEACAAAAAAAAAEAAAAAAAAAAAAAAAEAAAAAAAAAAAAAChgMAAJMDAARZhsABBoHAAgiCwAadiMAF10gABZUHgADXQoAAAYAABljIQANVxcAFl8bACxlMgACTwsAEVMYAAAMAAAaWyMAEXQeAB9qJgAHFAQAF20fAAgnDAAADwAAAg8AAB5XJAAAEgAAIXIpABN0HQASaxsAGGYfABxmJgAucjcAASMFAAAVAAAvXTMAHGUhABFfGAAACwAAIl4iAAABAAA5fUIAAA4AAAIcBQAWaR4AJ3QxAAcaCQACZg4AEE4YAAAeAAAgbyYAAxACAAAHAAAPaBgACWwWAAAUAAAAEwIAFzcYAC9pMwAAIQAAC3EZAA9rGAAAFwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADwAAAAAAAAAAAABJyMYAAA8IisFAAAAAAA8GhwwIAAbBxMIPAAAAAAAFSgtPQIAKyE3CTM8AAAAPDYyES85AAA8IzU8PDwAADwUOxUAAAAAPAAAFQ48AAA8Bh4qFRUAAAAAFSUWPAAAKzY2EisAAAAAADwNHzwAADg8PDwAAAAAAAAAFRUAAAAAAAAAOhcAAAo/BAApAAAAAAAKPA8QLAA8LjERAAAAAAAAADw2CzY8JAMMPDwAAAAAAAAAFT48NiYdPAAAAAAAAAAAAAAVETQZJwAAAAAAAAAAAAAAAAAAAAAAAAAAAP//AAD/vwAA4YcAAMEHAADBAwAAgYEAAIexAACB4QAAg+EAAIfzAAD5CwAA4IcAAPADAAD4DwAA/B8AAP//AAA="
        rel="icon" type="image/x-icon" />

    <!-- fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Days+One&family=Noto+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/home.css">
</head>

<body>
    <div class="maincontainer">
        <!-- code for top navigation bar  -->
        <div class="top-navigation">
            <div class="left-logo">
                <img src="../../assets/logo_kachrewala.png" alt="">
                <h2>KachreWala</h2>
            </div>
            <div class="user-img">
                <img src="../../assets/user-img.png" alt="">
            </div>
        </div> <!-- end of top navigation bar -->



        <!-- card for weather and city information  -->
        <div class="home-weather">

            <div class="weather-left-information">
                <h1 class="cityname">Jaipur</h1>
                <img src="../../assets/weather/sun-logo.png" alt="" class="weather-icon">
                <div class="info">
                    <p>
                        Sunny 25° Celcius
                    </p>
                    <p>
                        <strong> AQI :</strong> 35
                    </p>
                </div>
            </div>
            <!-- this will have the monument from the city  -->
            <div class="city-png">
            </div>

        </div> <!-- end of end of weather card -->


        <!-- code for swiper menu  -->
        <div class="swiper mySwiper">
            <div class="swiper-wrapper">
                <div class="swiper-slide collected-plastic">
                    <div class="swiper-slide-maincontainer">
                        <div class="swiper-headings-and-numberdata">
                            <div class="swiper-headings">
                                <h1>Plastics</h1>
                                <h1>you’ve</h1>
                                <h1>collected</h1>
                            </div>
                            <h1>15</h1>
                        </div>

                    </div>
                    <img src="../../assets/plastic_1.png" alt="" class="swiper-image">
                </div>
                <div class="swiper-slide centers-near-you">
                    <div class="swiper-slide-maincontainer">
                        <div class="swiper-headings-and-numberdata">
                            <div class="swiper-headings">
                                <h1>Centres</h1>
                                <h1>around</h1>
                                <h1>you</h1>
                            </div>
                            <h1>3</h1>
                        </div>

                    </div>
                    <img src="../../assets/centers.png" alt="" class="swiper-image centers-swiper-image">
                </div>
            </div>
            <div class="swiper-pagination"></div>
        </div> <!-- end of swiper -->

    </div> <!-- end of main body container -->

    <div class="dock">

        <img src="../../assets/up-arrow.png" alt="">

        <div class="dock_main_container">
            <div class="dockicons">
                <div class="scan">
                    <img src="../../assets/qr-code.png" alt="">
                </div>
            </div>
        </div>

        <div class="or">
            <div class="line"></div>
            <p>OR</p>
            <div class="line"></div>
        </div>

    </div>

    <!-- Swiper JS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />

    <script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>

    <script src="js/home.js"></script>
</body>

</html>