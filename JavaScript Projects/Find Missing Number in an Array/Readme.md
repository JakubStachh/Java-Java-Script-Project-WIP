# 🔢 Missing Number Finder

## 📚 Overview
This JavaScript function finds the **missing number** from a sequence of consecutive numbers (starting from 1). The function assumes the numbers are from 1 to `n`, but one number is missing. The goal is to determine which number is absent.

---

## ⚙️ Function

### `missingNumber(arr)`

#### 🧾 Parameters:
- `arr` (Array): An array of numbers (from 1 to `n`), with one missing number.

#### 🎯 Returns:
- The **missing number** from the sequence.

---

## 🧪 Example Usage

```javascript
function missingNumber(arr) {
    let n = arr.length + 1; // Expected number of elements
    let sum = (n * (n + 1)) / 2; // Sum of first n natural numbers
    let arrSum = arr.reduce((acc, num) => acc + num, 0); // Sum of elements in the array
    return sum - arrSum; // Missing number
}

console.log(missingNumber([1, 2, 3, 5])); // 4 ✅
console.log(missingNumber([1, 3, 4, 5])); // 2 ✅
console.log(missingNumber([1, 2, 4, 5, 6])); // 3 ✅
```

---
## 🔍 How It Works
1. Calculate the expected sum of numbers from `1` to `n` using the formula:

<br></br>
$$
\large \text{sum} = \frac{n(n + 1)}{2}
$$
<br></br>

       where `n` is the length of the `array + 1` (because one number is missing).
##
2. Calculate the sum of the elements in the array.

3. The missing number is found by subtracting the sum of the array from the expected sum. This gives us the number that's missing.

---
## 📊 Example Output
1. **Given an array like** `[1, 2, 3, 5]`, the missing number is `4` because the expected sequence is `[1, 2, 3, 4, 5]`.

---
## 🚀 Use Cases
- Array manipulation and pattern recognition 🧩

- Problem-solving in algorithm challenges ⚙️

- Mathematical sequence completion 📐

- Finding errors in data 🛠️

