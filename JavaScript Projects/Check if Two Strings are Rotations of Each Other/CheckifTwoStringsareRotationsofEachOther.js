function areRotations(str1, str2) {
    return str1.length === str2.length && (str1 + str1).includes(str2);
}
console.log(areRotations("abcde", "deabc")); // true
console.log(areRotations("abc", "acb")); // false
