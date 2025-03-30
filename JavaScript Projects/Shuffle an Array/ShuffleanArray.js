function shuffleArray(arr) {
    return arr.sort(() => Math.random() - 0.5);
}
console.log(shuffleArray([1, 2, 3, 4, 5])); // Random order
