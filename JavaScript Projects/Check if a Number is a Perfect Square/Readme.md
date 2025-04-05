# Perfect Square Checker 🟩

## Overview 🌟
This JavaScript function checks whether a given number is a **perfect square**. A perfect square is an integer that is the square of another integer.

## Function ⚙️

### `isPerfectSquare(num)`

#### Parameters:
- `num` (Number): The number you want to check.

#### Returns:
- `true` ✅ if the number is a perfect square.
- `false` ❌ if the number is not a perfect square.

### Example Usage 🖥️:
```javascript
console.log(isPerfectSquare(25)); // true ✅
console.log(isPerfectSquare(26)); // false ❌
```

---
## How It Works 🔍:
1. The function uses the `Math.sqrt()` method to calculate the square root of the number.

2. It checks whether the square root is an integer by using Number`.isInteger()`.

3. If the square root is an integer, it returns `true` ✅, indicating that the number is a perfect square.

4. If not, it returns `false` ❌, indicating that the number is not a perfect square.

---
## Example Output 📊:
```javascript
isPerfectSquare(25); // true ✅
isPerfectSquare(26); // false ❌
```
