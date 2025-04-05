# Prime Number Checker 🔢✨

## Overview 🌟
This simple JavaScript function checks whether a given number is prime. A prime number is a number greater than 1 that is divisible only by 1 and itself.

## Function ⚙️

### `isPrime(num)`

#### Parameters:
- `num` (Number): The number to check for primality.

#### Returns:
- `true` ✅ if the number is prime.
- `false` ❌ if the number is not prime.

### Example Usage 🖥️:
```javascript
console.log(isPrime(11)); // true ✅
console.log(isPrime(10)); // false ❌
```

---
## How It Works 🔍:
1. If the number is less than 2, it's not prime ❌.

2. The function loops from 2 to the number - 1, checking if the number is divisible by any of these numbers 🔢.

3. If a divisor is found, the function returns `false` ❌, indicating the number is not prime.

4. If no divisors are found, it returns `true` ✅, indicating the number is prime.

---
## Example Output 📊:
```javascript
isPrime(11); // true ✅
isPrime(10); // false ❌
```
