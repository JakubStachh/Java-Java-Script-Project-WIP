# 🔗 Array Union Function

## 📚 Overview
This JavaScript function takes two arrays and returns a **new array** that contains all unique elements from both arrays. It combines the arrays and removes duplicates.

---

## ⚙️ Function

### `arrayUnion(arr1, arr2)`

#### 🧾 Parameters:
- `arr1` (Array): The first array.
- `arr2` (Array): The second array.

#### 🎯 Returns:
- A **new array** containing all unique elements from both `arr1` and `arr2`.

---

## 🧪 Example Usage

```javascript
function arrayUnion(arr1, arr2) {
    return [...new Set([...arr1, ...arr2])];
}

console.log(arrayUnion([1, 2, 3], [3, 4, 5])); // [1, 2, 3, 4, 5] ✅
console.log(arrayUnion([1, 1, 1], [2, 2, 2])); // [1, 2] ✅
console.log(arrayUnion([5, 6, 7], [7, 8, 9])); // [5, 6, 7, 8, 9] ✅
```

---
## 🔍 How It Works
1. The function first combines both arrays `arr1` and `arr2` using the spread operator (`...`).
##
2. The `new Set()` is used to create a set, which automatically removes any duplicate values.
##
3. The spread operator (`...`) is used again to convert the set back into an array, which is then returned.

---
## 📊 Example Output
- For `arrayUnion([1, 2, 3], [3, 4, 5])`, the output is `[1, 2, 3, 4, 5]` as the duplicates are removed.

- For `arrayUnion([1, 1, 1], [2, 2, 2])`, the output is `[1, 2]`, with duplicates eliminated.

- For `arrayUnion([5, 6, 7], [7, 8, 9])`, the output is `[5, 6, 7, 8, 9]`.

---
## 🚀 Use Cases
- Combining data: Merge datasets while ensuring uniqueness 🗂️

- Removing duplicates: Quickly remove duplicate elements from two arrays 🔄

- Set operations: Useful for union operations in data analysis 📊
