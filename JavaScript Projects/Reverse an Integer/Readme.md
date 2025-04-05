# 🔄 Reverse Integer Function

## 📚 Overview
The **reverseInteger** function takes an integer as input and returns the integer with its digits reversed. It also handles negative numbers correctly, maintaining the sign.

---

## ⚙️ Function

### `reverseInteger(num)`

#### 🧾 Parameters:
- `num` (Number): The integer that you want to reverse.

#### 🎯 Returns:
- A new integer with the digits reversed, maintaining the sign for negative numbers.

---

## 🧪 Example Usage

```javascript
function reverseInteger(num) {
    let reversed = parseInt(num.toString().split('').reverse().join('')) * Math.sign(num);
    return reversed;
}

console.log(reverseInteger(1234)); // 4321
console.log(reverseInteger(-567)); // -765
```

---
## 🔍 How It Works
1. `toString()`: Converts the number into a string to manipulate its digits.
##
2. `split('')`: Splits the string into an array of individual characters (digits).
##
3. `reverse()`: Reverses the order of the digits in the array.
##
4. `join('')`: Joins the reversed array back into a string.
##
5. `parseInt()`: Converts the reversed string back into an integer.
##
6. `Math.sign(num)`: Multiplies by the sign of the original number to maintain the negative sign (if the number is negative).

---
## 📊 Example Output
- **Input**: `1234`

- **Output**: `4321`

- **Input**: `-567`

- **Output**: `-765`

---
## 🚀 Use Cases
- **Number Reversal**: Useful for problems that require reversing the digits of an integer.

- **Palindrome Checking**: Can be used in algorithms to check if an integer is a palindrome.

- **Data Processing**: Handy in data manipulation tasks where reversed numerical data is needed.
