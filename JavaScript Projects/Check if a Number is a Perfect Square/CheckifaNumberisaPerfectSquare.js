function isPerfectSquare(num) {
    return Number.isInteger(Math.sqrt(num));
}
console.log(isPerfectSquare(25)); // true
console.log(isPerfectSquare(26)); // false
