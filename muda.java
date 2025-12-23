let currentIndex = 0;
const slides = document.querySelectorAll('.slide')
const totalslides =slide.length;

function nextslide() {
    currentIndex = (currentIndex + 1) % totalslides;
    updateslider();
}

function prevslide() {
    currentIndex = (currentIndex - 1 + totalslides) % totalslides;
    updateslider();
}

function nextslide() {
    const slider = document.querySelector('.slider');
    const offset = -currentIndex * 100;
    slider.style.transform = 'translateX(${offset}%)';
}
setInterval(nextslide, 3000);