function fibonacci(n) {
    let a = 0, b = 1, temp;
    while (n-- > 0) {
        temp = a + b;
        a = b;
        b = temp;
    }
    return a;
}
console.log(fibonacci(6)); // 8
