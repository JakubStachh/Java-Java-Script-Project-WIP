# 🏛️ Roman Numeral to Integer Converter

## 📜 Overview  
This JavaScript function converts a Roman numeral string into its corresponding **integer** value.

---

## ⚙️ Function

### `romanToInt(roman)`

#### 📥 Parameters:
- `roman` (String): The Roman numeral (e.g., `"IX"`, `"XLII"`)

#### 📤 Returns:
- An integer representing the Roman numeral  
  ➕ e.g., `"IX"` → `9`, `"XLII"` → `42`

---

## 🧪 Example Usage

```javascript
function romanToInt(roman) {
    const values = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };
    let total = 0;
    for (let i = 0; i < roman.length; i++) {
        if (values[roman[i]] < values[roman[i + 1]]) {
            total -= values[roman[i]];
        } else {
            total += values[roman[i]];
        }
    }
    return total;
}

console.log(romanToInt("IX"));    // 9 ✅
console.log(romanToInt("XLII"));  // 42 ✅
```
🔍 How It Works
A lookup table (values) stores the integer values for Roman symbols.

Loop through the Roman numeral string:

If a smaller value comes before a larger one (like I before X), subtract it.

Otherwise, add it.

Add or subtract each value accordingly to get the final result!

🧠 Roman Numerals Reference:

|Symbol |	Value|
|-------|------|
|  I    |  1   |
|V|5|
|X|10|
|L|50|
|C|100|
|D|500|
|M|1000|
🧾 Sample Output
Copy
Edit
9
42
