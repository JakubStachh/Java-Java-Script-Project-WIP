function gcd(a, b) {
    return b === 0 ? a : gcd(b, a % b);
}
console.log(gcd(56, 98)); // 14
