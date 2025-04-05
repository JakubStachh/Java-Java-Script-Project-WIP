# 🔍 Find Smallest Function

## 📚 Overview
This JavaScript function finds the **smallest** number in an array. It uses the `Math.min()` function to return the smallest element in the provided array.

---

## ⚙️ Function

### `findSmallest(arr)`

#### 🧾 Parameters:
- `arr` (Array): An array of numbers.

#### 🎯 Returns:
- The **smallest number** in the array.

---

## 🧪 Example Usage

```javascript
function findSmallest(arr) {
    return Math.min(...arr);
}

console.log(findSmallest([3, 5, 7, 2, 8])); // 2 ✅
console.log(findSmallest([10, 20, 30])); // 10 ✅
console.log(findSmallest([100, 200, 300])); // 100 ✅
```

---

## 🔍 How It Works
1. The function uses `Math.min()` to find the smallest number in the array.
##
2. The `...arr` (spread operator) is used to pass the array elements as individual arguments to the `Math.min()` function.
##
3. The smallest value is returned from the function.

---
## 📊 Example Output
- For `findSmallest([3, 5, 7, 2, 8])`, the output is `2`, the smallest number in the array.

- For `findSmallest([10, 20, 30])`, the output is `10` because it's the smallest in the array.

- For `findSmallest([100, 200, 300])`, the result is 100, the smallest number.

---
## 🚀 Use Cases
- Array analysis: Quickly find the smallest number in any numerical dataset 🧑‍💻

- Data processing: Useful for filtering or sorting data based on minimum value 📊

- Competitive programming: Solve problems where you need to identify the smallest element in an array 🎯
