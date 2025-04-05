# 🧩 First Non-Repeating Character Finder

## 📚 Overview
This JavaScript function finds the **first non-repeating character** in a given string. It checks each character to identify the first one that does not repeat. If all characters repeat, it returns `null`.

---

## ⚙️ Function

### `firstNonRepeatingChar(str)`

#### 🧾 Parameters:
- `str` (String): The input string in which we need to find the first non-repeating character.

#### 🎯 Returns:
- The **first non-repeating character** in the string.
- Returns `null` if all characters repeat.

---

## 🧪 Example Usage

```javascript
function firstNonRepeatingChar(str) {
    for (let char of str) {
        if (str.indexOf(char) === str.lastIndexOf(char)) {
            return char;
        }
    }
    return null;
}

console.log(firstNonRepeatingChar("aabbccde")); // "d" ✅
console.log(firstNonRepeatingChar("aabbcc")); // null ❌
console.log(firstNonRepeatingChar("xxyyzz")); // null ❌
console.log(firstNonRepeatingChar("abcde")); // "a" ✅
```

---
## 🔍 How It Works
1. The function iterates through each character in the string.

2. For each character, it checks if its first occurrence (`indexOf`) is the same as its last occurrence (`lastIndexOf`):

    - If they are the same, it means the character is non-repeating, and we return it immediately.

3. If no non-repeating character is found, the function returns `null`.

---
## 📊 Example Output
- Given the string `"aabbccde"`, the first non-repeating character is `"d"`.

- In the string `"aabbcc"`, all characters repeat, so the output is `null`.

---
## 🚀 Use Cases
- Identifying unique elements in a dataset 🔢

- Problem-solving in algorithm challenges ⚙️

- Data cleaning and analysis 📊
