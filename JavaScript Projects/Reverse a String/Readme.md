# 🔄 Reverse String Function

## 📚 Overview
The **reverseString** function takes a string as input and returns a new string with the characters reversed. This can be useful when manipulating or displaying strings in reverse order.

---

## ⚙️ Function

### `reverseString(str)`

#### 🧾 Parameters:
- `str` (String): The string that you want to reverse.

#### 🎯 Returns:
- A new string with the characters in reverse order.

---

## 🧪 Example Usage

```javascript
function reverseString(str) {
    return str.split("").reverse().join("");
}

console.log(reverseString("hello")); // "olleh"
```

---
## 🔍 How It Works
1. `split("")`: The split method splits the string into an array of individual characters.
##
2. `reverse()`: The reverse method reverses the order of the elements in the array.
##
3. `join("")`: The join method joins the elements back into a single string.

---
## 📊 Example Output
- **Input**: `"hello"`

- **Output**: `"olleh"`

---
## 🚀 Use Cases
- **String Manipulation**: Useful for tasks like reversing words, letters, or sentences. 🔄

- **Palindrome Checking**: Often used in algorithms that check if a word is a palindrome. 🛑

- **Text Effects**: Can be used in web applications to create dynamic text effects. ✨
