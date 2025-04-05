# 🔗 Object to Query String Converter

## 🧠 Overview
This JavaScript function converts a JavaScript object into a **URL query string** (key-value pairs joined by `&`), making it ideal for HTTP requests or appending to URLs.

---

## ⚙️ Function

### `objectToQueryString(obj)`

#### 📥 Parameters:
- `obj` (Object): The object you want to convert.

#### 📤 Returns:
- A string formatted as a URL query string.

---

## 🧪 Example Usage

```javascript
function objectToQueryString(obj) {
    return Object.entries(obj)
        .map(([key, value]) => `${encodeURIComponent(key)}=${encodeURIComponent(value)}`)
        .join('&');
}

console.log(objectToQueryString({ name: "John", age: 30 }));
// Output: "name=John&age=30"
```

---
## 🔍 How It Works
- `Object.entries(obj)` turns the object into `[key, value]` pairs.

- `map()` formats each pair into `"key=value"` using `encodeURIComponent()` to handle special characters safely.

- `join('&')` combines all pairs into a single query string.

---
## ✨ Output Example
```bash
Input:  { name: "John", age: 30 }
Output: "name=John&age=30"
```
