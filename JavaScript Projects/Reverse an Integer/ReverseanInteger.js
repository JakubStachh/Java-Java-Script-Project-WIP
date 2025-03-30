function reverseInteger(num) {
    let reversed = parseInt(num.toString().split('').reverse().join('')) * Math.sign(num);
    return reversed;
}
console.log(reverseInteger(1234)); // 4321
console.log(reverseInteger(-567)); // -765
