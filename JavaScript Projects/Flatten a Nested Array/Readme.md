# 🌍 Flatten Array Function

## 📚 Overview
This JavaScript function takes a **nested array** (an array that contains other arrays) and flattens it into a single array, removing all nested structures. It uses the `flat()` method with `Infinity` to handle arrays with arbitrary levels of nesting.

---

## ⚙️ Function

### `flattenArray(arr)`

#### 🧾 Parameters:
- `arr` (Array): The array that needs to be flattened.

#### 🎯 Returns:
- A **single, flattened array** with all nested elements merged into one array.

---

## 🧪 Example Usage

```javascript
function flattenArray(arr) {
    return arr.flat(Infinity);
}

console.log(flattenArray([1, [2, [3, [4, 5]]]])); // [1, 2, 3, 4, 5] ✅
console.log(flattenArray([1, [2, 3], [4, 5]])); // [1, 2, 3, 4, 5] ✅
console.log(flattenArray([['a', 'b'], ['c', 'd'], 'e'])); // ['a', 'b', 'c', 'd', 'e'] ✅
```

---
## 🔍 How It Works
1. The function uses the `flat()` method, which is built-in in JavaScript, to flatten an array.
##
2. By passing `Infinity` as an argument to `flat()`, it recursively flattens the array until all nested structures are completely merged into one array.

---
## 📊 Example Output
- For `flattenArray([1, [2, [3, [4, 5]]]])`, the output is `[1, 2, 3, 4, 5]` as all the nested arrays are flattened.

- For `flattenArray([1, [2, 3], [4, 5]])`, the output is `[1, 2, 3, 4, 5]`, with the inner arrays merged.

- For `flattenArray([['a', 'b'], ['c', 'd'], 'e'])`, the output is `['a', 'b', 'c', 'd', 'e']`, with all elements in one array.

---
## 🚀 Use Cases
- Data normalization: Flatten arrays from multi-level data structures 🗃️

- Handling deeply nested data: Easily flatten deep data arrays for further processing 📊

- Array manipulation: Useful for simplifying arrays before performing further operations 🔧
