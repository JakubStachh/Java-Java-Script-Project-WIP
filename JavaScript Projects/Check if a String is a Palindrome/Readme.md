# 🔁 Palindrome Checker

## ✨ Overview  
This JavaScript function checks if a given string is a **palindrome** — a word that reads the same backward as forward!

## ⚙️ Function

### `isPalindrome(str)`

#### 📥 Parameters:
- `str` (String): The string to check.

#### 📤 Returns:
- `true` ✅ if the string is a palindrome  
- `false` ❌ if it is not

---

## 🧪 Example Usage
```javascript
function isPalindrome(str) {
    return str === str.split("").reverse().join("");
}

console.log(isPalindrome("racecar")); // true ✅
console.log(isPalindrome("hello"));   // false ❌
```
---
## 🔍 How It Works
1. Splits the string into characters with `.split("")`

2. Reverses the array with `.reverse()`

3. Joins it back into a string with `.join("")`

4. Compares the result to the original string

If they match, it's a palindrome! 

---
## 📊 Sample Output
```arduino
true
false
```
