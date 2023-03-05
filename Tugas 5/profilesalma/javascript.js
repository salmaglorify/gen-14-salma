//agar tombol menu garis 3 berfungsi
var tombolMenu = $(".tombol-menu");
var menu = $("nav .menu ul");

function klikMenu() {
    tombolMenu.click(function(){
        menu.toggle();
    });
    menu.click(function(){
        menu.toggle();
    });
}

$(document).ready(function(){
    var width = $(window).width();
    if(width < 990) {
        klikMenu();
    }
})

//check lebar
//navigasi menu fullscreen tetap ada, walaupun diklik saat minimize
$(window).resize(function(){
    var width = $(window).width();
    if(width > 989) {
        menu.css("display","block");
    } else {
        menu.css("display","none");
    }
    klikMenu();
});

//navigasi menu diberi background saat aktivitas scroll
$(document).ready(function(){
    var scroll_pos = 0;
    $(document).scroll(function(){
        scroll_pos = $(this).scrollTop();
         if(scroll_pos > 0){
            $("nav").addClass("putih");
         } else {
            $("nav").removeClass("putih");
         }
    })
});
