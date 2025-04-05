# 🥈 Second Largest Finder Function

## 📚 Overview
This JavaScript function finds the **second largest** number in an array. It iterates through the array, keeping track of the largest and second largest numbers, and returns the second largest value.

---

## ⚙️ Function

### `secondLargest(arr)`

#### 🧾 Parameters:
- `arr` (Array): An array of numbers.

#### 🎯 Returns:
- The **second largest number** in the array. If there is no second largest number (e.g., when the array has fewer than two distinct numbers), it returns `-Infinity`.

---

## 🧪 Example Usage

```javascript
function secondLargest(arr) {
    let first = -Infinity, second = -Infinity;
    for (let num of arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num !== first) {
            second = num;
        }
    }
    return second;
}

console.log(secondLargest([10, 20, 4, 45, 99])); // 45 ✅
console.log(secondLargest([5, 5, 5])); // -Infinity ❌
console.log(secondLargest([1, 2, 3, 4, 5])); // 4 ✅
```

---
## 🔍 How It Works
1. The function initializes two variables `first` and `second` to `-Infinity` to keep track of the largest and second largest numbers.
##
2. It iterates through the array:

    - If a number is greater than `first`, it updates `second` to the previous `first` and sets `first` to the new number.

    - If the number is greater than `second` and not equal to `first`, it updates `second`.
##
3. After the loop, the value of `second` is returned.


---
## 📊 Example Output
- For `secondLargest([10, 20, 4, 45, 99])`, the output is `45`, which is the second largest number.

- In the case of `secondLargest([5, 5, 5])`, the result is `-Infinity` because all numbers are the same, and no second largest number exists.

- For `secondLargest([1, 2, 3, 4, 5])`, the output is `4` because it is the second largest number in the array.

---
## 🚀 Use Cases
- Array analysis: Quickly find the second largest number in any numerical dataset 🧑‍💻

- Data processing: Useful when you need to analyze or filter data based on size or rankings 📊

- Competitive programming: Solve problems that require identifying the second largest element in an array 🎯
