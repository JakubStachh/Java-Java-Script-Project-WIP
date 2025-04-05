# ✨ Factorial Function

## 📚 Overview
This JavaScript function calculates the **factorial** of a non-negative integer using recursion.  
Factorial of `n` is the product of all positive integers less than or equal to `n` (i.e., `n!`).

---

## ⚙️ Function

### `factorial(n)`

#### 🧾 Parameters:
- `n` (Number): A non-negative integer.

#### 🎯 Returns:
- The **factorial** of `n`.

---

## 🧪 Example Usage

```javascript
function factorial(n) {
    return n === 0 ? 1 : n * factorial(n - 1);
}

console.log(factorial(5)); // 120 ✅
console.log(factorial(0)); // 1 ✅
```

---
## 🔍 How It Works
- If `n` is `0`, the function returns `1` (because `0! = 1`).

- Otherwise, it calls itself recursively multiplying `n * factorial(n - 1)` until it reaches 0.

---
## 📊 Output Example
```yaml
factorial(5) = 5 × 4 × 3 × 2 × 1 = 120
```
