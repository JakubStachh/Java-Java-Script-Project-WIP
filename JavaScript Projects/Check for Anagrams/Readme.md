# Anagram Checker 🔄

## Overview 🌟
This JavaScript function checks if two given strings are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Function ⚙️

### `isAnagram(str1, str2)`

#### Parameters:
- `str1` (String): The first string to check.
- `str2` (String): The second string to check.

#### Returns:
- `true` ✅ if the strings are anagrams.
- `false` ❌ if the strings are not anagrams.

### Example Usage 🖥️:
```javascript
console.log(isAnagram("listen", "silent")); // true ✅
console.log(isAnagram("hello", "world"));   // false ❌
```

---
## How It Works 🔍:
1. The function splits both strings into arrays of characters ✂️.

2. Each array is sorted alphabetically 🔠.

3. The sorted arrays are joined back into strings and compared 🆚.

4. If the sorted strings are identical, the function returns `true` ✅, meaning the strings are anagrams.

5. Otherwise, it returns `false` ❌.

---
## Example Output 📊:
```javascript
isAnagram("listen", "silent"); // true ✅
isAnagram("hello", "world");   // false ❌
```
