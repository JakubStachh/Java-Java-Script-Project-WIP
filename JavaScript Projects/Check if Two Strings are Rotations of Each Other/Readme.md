# Rotation Checker 🔄

## Overview 🌟
This JavaScript function checks if one string is a rotation of another. In other words, it checks if you can rotate one string to form the other by shifting characters.

## Function ⚙️

### `areRotations(str1, str2)`

#### Parameters:
- `str1` (String): The first string to check.
- `str2` (String): The second string to check if it’s a rotation of the first.

#### Returns:
- `true` ✅ if the second string is a rotation of the first.
- `false` ❌ if the second string is not a rotation of the first.

### Example Usage 🖥️:
```javascript
console.log(areRotations("abcde", "deabc")); // true ✅
console.log(areRotations("abc", "acb"));    // false ❌
```

---
## How It Works 🔍:
1. The function first checks if both strings are of the same length 🧮.

2. It then concatenates the first string with itself (`str1` + `str1`) 🔗.

3. If the second string is a substring of the concatenated string, then it is a rotation of the first string 🔄.

4. If both conditions are true, it returns `true` ✅, otherwise it returns `false` ❌.

---
## Example Output 📊:
```javascript
areRotations("abcde", "deabc"); // true ✅
areRotations("abc", "acb");     // false ❌
```
