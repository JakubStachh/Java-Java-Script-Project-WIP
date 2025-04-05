# 🔤 Count Vowels in a String

## 📚 Overview
This JavaScript function counts the number of **vowels** (A, E, I, O, U) in a given string. It works with both lowercase and uppercase letters! 🔍✨

---

## ⚙️ Function

### `countVowels(str)`

#### 📥 Parameters:
- `str` (String): The input string to analyze.

#### 📤 Returns:
- A number representing the **total count** of vowels in the string.

---

## 🧪 Example Usage

```javascript
function countVowels(str) {
    return str.match(/[aeiou]/gi)?.length || 0;
}

console.log(countVowels("hello world")); // 3 ✅
console.log(countVowels("AEIOU"));       // 5 ✅
console.log(countVowels("xyz"));         // 0 ❌
```

----
## 🛠️ How It Works
- Uses a regular expression `/[aeiou]/gi` to match all vowels (case-insensitive).

- `match()` returns an array of matches, or `null` if there are none.

- `?.length || 0` safely returns the count or 0 if no matches were found.

---
## 📊 Output Example
```yaml
Input:  "hello world"
Output: 3
```
