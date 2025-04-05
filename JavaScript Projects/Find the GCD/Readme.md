# 🧮 Greatest Common Divisor (GCD) Finder

## 📚 Overview
This JavaScript function calculates the **Greatest Common Divisor (GCD)** of two numbers. The GCD is the largest integer that divides both numbers without leaving a remainder.

The function uses the **Euclidean algorithm**, a well-known method for computing the GCD of two numbers.

---

## ⚙️ Function

### `gcd(a, b)`

#### 🧾 Parameters:
- `a` (Number): The first integer.
- `b` (Number): The second integer.

#### 🎯 Returns:
- The **Greatest Common Divisor (GCD)** of `a` and `b`.

---

## 🧪 Example Usage

```javascript
function gcd(a, b) {
    return b === 0 ? a : gcd(b, a % b);
}

console.log(gcd(56, 98)); // 14 ✅
console.log(gcd(48, 180)); // 12 ✅
console.log(gcd(101, 103)); // 1 ✅
console.log(gcd(54, 24)); // 6 ✅
```

---
## 🔍 How It Works
1. The function uses the **Euclidean algorithm:**

   - If `b` is `0`, then the GCD is `a`.

   - Otherwise, the function calls itself recursively with `b` and the remainder of `a` divided by `b`.

2. This process continues until the remainder is 0, at which point the GCD is the non-zero number.


---
## 📊 Example Output
- Given `gcd(56, 98)`, the output is 14 because 14 is the largest number that divides both 56 and 98 without leaving a remainder.

- For `gcd(48, 180)`, the output is 12 because 12 is the largest number that divides both 48 and 180.

- In the case of `gcd(101, 103)`, since both are prime numbers, the GCD is 1.


---
## 🚀 Use Cases
- Mathematical computations in algorithms 🧮

- Finding common factors between numbers 🔢

- Optimizing fractions in mathematical problems 📉
