# 🔢 LCM (Least Common Multiple) Calculator

## 📚 Overview
This JavaScript function calculates the **Least Common Multiple (LCM)** of two numbers. The LCM of two integers is the smallest positive integer that is divisible by both numbers.

---

## ⚙️ Function

### `lcm(a, b)`

#### 🧾 Parameters:
- `a` (Number): The first integer.
- `b` (Number): The second integer.

#### 🎯 Returns:
- The **LCM** of the two numbers as an integer.

---

## 🧪 Example Usage

```javascript
function lcm(a, b) {
    return (a * b) / gcd(a, b);
}

console.log(lcm(4, 6)); // 12 ✅
console.log(lcm(5, 10)); // 10 ✅
console.log(lcm(7, 3)); // 21 ✅
```

---
## 🔍 How It Works
1. The function calculates the LCM by using the formula:


$$
\text{LCM}(a, b) = \frac{a \times b}{\text{GCD}(a, b)}
$$
```
​where GCD stands for the Greatest Common Divisor.
```
##
2. It uses the helper function `gcd(a, b)` (not shown here, but assumed to be implemented) to find the greatest common divisor of the two numbers. Then, the LCM is computed using the formula.
##
3. The function returns the LCM as an integer.

---
## 📊 Example Output
- Given `lcm(4, 6)`, the output is `12` because `12` is the smallest number divisible by both `4` and `6`.

- For `lcm(5, 10)`, the result is `10`, as `10` is the least number divisible by both `5` and `10`.

- In the case of `lcm(7, 3)`, the LCM is `21`, which is the smallest number divisible by both `7` and `3`.

---
## 🚀 Use Cases
- Finding common multiples in problems related to time intervals ⏱️

- Solving problems in number theory, such as simplifying ratios and fractions 🔢

- Optimizing scheduling where cycles or intervals need to coincide ⏳
