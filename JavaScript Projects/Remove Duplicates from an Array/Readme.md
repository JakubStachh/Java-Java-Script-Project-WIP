# 🚫 Remove Duplicates Function

## 📚 Overview
The **removeDuplicates** function takes an array and removes all duplicate values, returning a new array with only unique elements. This is useful when you need to eliminate repeated values from an array to ensure that every element appears only once.

---

## ⚙️ Function

### `removeDuplicates(arr)`

#### 🧾 Parameters:
- `arr` (Array): The array from which duplicates will be removed.

#### 🎯 Returns:
- A new array with only unique values, removing any duplicates from the input array.

---

## 🧪 Example Usage

```javascript
function removeDuplicates(arr) {
    return [...new Set(arr)];
}

console.log(removeDuplicates([1, 2, 2, 3, 4, 4])); // [1, 2, 3, 4]
```

---
## 🔍 How It Works
1. **Set**: In JavaScript, a `Set` is a collection of unique values. When you pass an array into a `Set`, all duplicate elements are automatically discarded.
##
2. **Spread Operator**: The spread operator `...` is used to create a new array from the `Set` object. This ensures that the original array remains unmodified.
##
3. The result is a new array that contains only the unique values from the original array.

---
## 📊 Example Output
- **Input**: `[1, 2, 2, 3, 4, 4]`

- **Output**: `[1, 2, 3, 4]`

---
## 🚀 Use Cases
- **Data Cleaning**: When handling datasets, remove duplicate entries to ensure clean and unique data. 📊

- **Filtering**: Remove duplicate values from a list before processing or rendering them. 🗂️

- **Optimization**: Improve performance by eliminating redundant values from large arrays. ⚡
