var swiper = new Swiper(".mySwiper", {
    slidesPerView: 'auto',
    spaceBetween: 30,
    freeMode: true,
    // pagination: {
    //     el: ".swiper-pagination",
    //     clickable: true,
    // },
});



// code for detection of swipe
function swipedetect(el, callback) {

    var touchsurface = el,
        swipedir,
        startX,
        startY,
        distX,
        distY,
        threshold = 150, //required min distance traveled to be considered swipe
        restraint = 100, // maximum distance allowed at the same time in perpendicular direction
        allowedTime = 300, // maximum time allowed to travel that distance
        elapsedTime,
        startTime,
        handleswipe = callback || function (swipedir) { }

    touchsurface.addEventListener('touchstart', function (e) {
        var touchobj = e.changedTouches[0]
        swipedir = 'none'
        dist = 0
        startX = touchobj.pageX
        startY = touchobj.pageY
        startTime = new Date().getTime() // record time when finger first makes contact with surface
        e.preventDefault()
    }, false)

    touchsurface.addEventListener('touchmove', function (e) {
        e.preventDefault() // prevent scrolling when inside DIV
    }, false)

    touchsurface.addEventListener('touchend', function (e) {
        var touchobj = e.changedTouches[0]
        distX = touchobj.pageX - startX // get horizontal dist traveled by finger while in contact with surface
        distY = touchobj.pageY - startY // get vertical dist traveled by finger while in contact with surface
        elapsedTime = new Date().getTime() - startTime // get time elapsed
        if (elapsedTime <= allowedTime) { // first condition for awipe met
            if (Math.abs(distX) >= threshold && Math.abs(distY) <= restraint) { // 2nd condition for horizontal swipe met
                swipedir = (distX < 0) ? 'left' : 'right' // if dist traveled is negative, it indicates left swipe
            }
            else if (Math.abs(distY) >= threshold && Math.abs(distX) <= restraint) { // 2nd condition for vertical swipe met
                swipedir = (distY < 0) ? 'up' : 'down' // if dist traveled is negative, it indicates up swipe
            }
        }
        handleswipe(swipedir)
        e.preventDefault()
    }, false)
}


// code for the scan qr button 
let extra = document.querySelector(".toggleablecontent");
let extraHeight = extra.offsetHeight;
console.log(extraHeight);

const dock = document.querySelector(".dock");
dock.style.transform = `translateY(${extraHeight}px)`

let uparrow = document.querySelector(".uparrow");
let darkScreen = document.querySelector(".darknessWhenToggle");

let topNavDown = false;
const topstats = document.querySelector(".userInfo");
const userLogo = document.getElementById("userimg");
const crossbtn = document.querySelector(".stats-crossbtn"); 9n


let toggleState = false;
const toggleFunction = () => {
    if (toggleState == false) {
        toggleState = true;
        dock.style.transform = `translateY(0px)`
        uparrow.style.transform = `rotate(180deg)`
        darkScreen.style.opacity = 0.85;
        darkScreen.style.visibility = `visible`;


    }
    else {
        toggleState = false;
        dock.style.transform = `translateY(${extraHeight}px)`
        uparrow.style.transform = `rotate(0deg)`
        darkScreen.style.visibility = `hidden`;

        darkScreen.style.opacity = 0;

    }
}
uparrow.addEventListener("click", toggleFunction);
let scanWindow = document.querySelector("#scanner");

darkScreen.onclick = () => {
    toggleState = false;
    dock.style.transform = `translateY(${extraHeight}px)`
    uparrow.style.transform = `rotate(0deg)`
    darkScreen.style.visibility = `hidden`;

    darkScreen.style.opacity = 0;

    topNavDown = false;
    topstats.style.transform = "translateY(-100%)"
    darkScreen.style.opacity = 0;
    darkScreen.style.visibility = `hidden`;
}

const scanBtn = document.querySelector(".scan")
scanBtn.addEventListener("click", () => {
    scanWindow.style.visibility = 'visible'
    scanWindow.style.opacity = '1'
})


// swipedetect(dock, function (swipedir) {
//     if (swipedir == "top") {
//         toggleState = true;
//         dock.style.transform = `translateY(0px)`
//         uparrow.style.transform = `rotate(180deg)`

//     }
//     else {
//         toggleState = false;
//         dock.style.transform = `translateY(${extraHeight}px)`
//         uparrow.style.transform = `rotate(0deg)`
//     }
// })


const scanner = new Html5QrcodeScanner('scannerChild', {
    qrbox: {
        width: 500,
        height: 500,
    },
    fps: 20,
})

scanner.render(success, error);

function success(result) {

}

function error(err) {
    console.error(err)
}


// code for preloader 
var loader = document.getElementById("preloader");

const loading_func = () => {
    loader.style.opacity = "0"
    loader.style.visibility = "hidden";

}

const temp = () => { setTimeout(loading_func, 3000); }

window.addEventListener("load", temp);

// code for user information 

userLogo.addEventListener("click", () => {
    if (topNavDown == false) {
        topNavDown = true;
        topstats.style.transform = "translateY(0%)"
        darkScreen.style.opacity = 0.85;
        darkScreen.style.visibility = `visible`;
    }
    else {
        topNavDown = false;
        topstats.style.transform = "translateY(-100%)"
        darkScreen.style.opacity = 0;
        darkScreen.style.visibility = `hidden`;
    }
})


crossbtn.onclick = () => {
    topNavDown = false;
    topstats.style.transform = "translateY(-100%)"
    darkScreen.style.opacity = 0;
    darkScreen.style.visibility = `hidden`;
}