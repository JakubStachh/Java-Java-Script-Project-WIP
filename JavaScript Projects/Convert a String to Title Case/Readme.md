# 📝 Title Case Converter

## 📚 Overview
This JavaScript function takes a string and converts it into **Title Case**, where the first letter of every word is capitalized.

---

## ⚙️ Function

### `titleCase(str)`

#### 📥 Parameters:
- `str` (String): A lowercase or mixed-case sentence.

#### 📤 Returns:
- A string with each word capitalized — **Title Case** format.

---

## 🧪 Example Usage

```javascript
function titleCase(str) {
    return str.replace(/\b\w/g, char => char.toUpperCase());
}

console.log(titleCase("hello world")); // "Hello World" ✅
console.log(titleCase("javascript is fun")); // "Javascript Is Fun" ✅
```

---
## 🔍 How It Works
- Uses a regular expression: `/\b\w/g`

   - `\b` matches word boundaries.

   - `\w` matches the first character of each word.

- Each matched character is transformed to uppercase using `char.toUpperCase()`.

---
## ✨ Output
```yaml
Hello World
Javascript Is Fun
```
