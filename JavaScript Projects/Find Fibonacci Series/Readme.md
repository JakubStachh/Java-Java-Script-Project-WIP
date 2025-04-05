# 🌟 Fibonacci Sequence Generator

## 📚 Overview
This JavaScript function generates the **n-th Fibonacci number** using an iterative approach.  
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones. The sequence starts with 0 and 1.

---

## ⚙️ Function

### `fibonacci(n)`

#### 🧾 Parameters:
- `n` (Number): The position in the Fibonacci sequence (non-negative integer).

#### 🎯 Returns:
- The **n-th Fibonacci number**.

---

## 🧪 Example Usage

```javascript
function fibonacci(n) {
    let a = 0, b = 1, temp;
    while (n-- > 0) {
        temp = a + b;
        a = b;
        b = temp;
    }
    return a;
}

console.log(fibonacci(6)); // 8 ✅
console.log(fibonacci(0)); // 0 ✅
console.log(fibonacci(10)); // 55 ✅
```

----
## 🔍 How It Works
- Start with `a = 0` and `b = 1`, which are the first two Fibonacci numbers.

- For each iteration, calculate the next Fibonacci number by adding `a + b`, then update `a` and `b`.

- The loop continues until `n` becomes zero, returning the n-th Fibonacci number.

---
## 📊 Fibonacci Sequence Example:
```yaml
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
```
For example:
  - `fibonacci(6)` returns `8` because the sequence starts `0, 1, 1, 2, 3, 5, 8...`

