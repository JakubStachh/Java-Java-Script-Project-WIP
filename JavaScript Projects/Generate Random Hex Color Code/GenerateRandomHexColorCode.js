function randomHexColor() {
    return `#${Math.floor(Math.random() * 16777215).toString(16)}`;
}
console.log(randomHexColor()); // Example output: "#ff5733"
