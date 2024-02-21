function openImage(imageSrc) {
    var fullScreenImage = document.querySelector('.full-screen-image');
    var image = fullScreenImage.querySelector('img');

    image.src = imageSrc;
    fullScreenImage.classList.remove('hidden');
}

document.addEventListener('DOMContentLoaded', function() {
    var fullScreenImage = document.querySelector('.full-screen-image');
    var closeButton = fullScreenImage.querySelector('.close-button');

    closeButton.addEventListener('click', function() {
        fullScreenImage.classList.add('hidden');
    });
});