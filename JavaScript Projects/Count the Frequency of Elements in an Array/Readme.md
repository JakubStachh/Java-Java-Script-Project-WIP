# 🔢 Count Frequency in an Array

## 📖 Overview
This JavaScript function calculates how many times each value appears in an array — giving you a **frequency count** of all elements. Great for stats, analytics, and data crunching! 💡📈

---

## ⚙️ Function

### `countFrequency(arr)`

#### 📥 Parameters:
- `arr` (Array): The array of values (numbers, strings, etc.)

#### 📤 Returns:
- An object where each key is a unique value from the array, and the value is how many times it appears.

---

## 🧪 Example Usage

```javascript
function countFrequency(arr) {
    return arr.reduce((acc, val) => {
        acc[val] = (acc[val] || 0) + 1;
        return acc;
    }, {});
}

console.log(countFrequency([1, 2, 2, 3, 3, 3, 4])); // Output: { 1: 1, 2: 2, 3: 3, 4: 1 }
```

---
## 🔍 How It Works
- Uses `Array.prototype.reduce()` to build a frequency map.

- If the value already exists in the map, it increments the count.

- If not, it sets the initial count to 1.

---
## ✨ Output Example
```yaml
Input:  [1, 2, 2, 3, 3, 3, 4]
Output: {1: 1, 2: 2, 3: 3, 4: 1}
```
