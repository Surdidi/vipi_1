

document.addEventListener('keydown', function(event) {
    if(event.keyCode == 37) {
        key_left();
    }
    else if(event.keyCode == 39) {
        key_right();
    }
    else if(event.keyCode == 32) {
        key_space();
    }
});
