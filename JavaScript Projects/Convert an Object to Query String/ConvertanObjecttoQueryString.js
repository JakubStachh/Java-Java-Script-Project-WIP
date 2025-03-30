function objectToQueryString(obj) {
    return Object.entries(obj).map(([key, value]) => `${encodeURIComponent(key)}=${encodeURIComponent(value)}`).join('&');
}
console.log(objectToQueryString({ name: "John", age: 30 })); // "name=John&age=30"
