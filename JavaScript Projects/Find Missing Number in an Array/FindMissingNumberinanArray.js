function missingNumber(arr) {
    let n = arr.length + 1;
    let sum = (n * (n + 1)) / 2;
    let arrSum = arr.reduce((acc, num) => acc + num, 0);
    return sum - arrSum;
}
console.log(missingNumber([1, 2, 3, 5])); // 4
