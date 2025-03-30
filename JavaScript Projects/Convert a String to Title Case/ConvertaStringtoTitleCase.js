function titleCase(str) {
    return str.replace(/\b\w/g, char => char.toUpperCase());
}
console.log(titleCase("hello world")); // "Hello World"
