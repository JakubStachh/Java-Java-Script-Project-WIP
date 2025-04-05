# ⏱️ Debounce Function

## 📚 Overview
This JavaScript function implements **debouncing** – a technique used to limit the rate at which a function is executed. It ensures that the function is executed only after a specified delay, and the execution is reset every time the function is called within that delay.

Debouncing is particularly useful when dealing with events like **scrolling**, **resizing**, or **key presses**, where you want to wait until the user stops interacting for a certain period before triggering the function.

---

## ⚙️ Function

### `debounce(func, delay)`

#### 🧾 Parameters:
- `func` (Function): The function to be debounced.
- `delay` (Number): The number of milliseconds to wait before executing the function after the last call.

#### 🎯 Returns:
- A new debounced version of the provided function.

---

## 🧪 Example Usage

```javascript
function debounce(func, delay) {
    let timer;
    return function (...args) {
        clearTimeout(timer);
        timer = setTimeout(() => func(...args), delay);
    };
}

const logMessage = debounce(() => console.log("Debounced!"), 2000);

logMessage(); // Waits 2 seconds before executing
```

---
## 🔍 How It Works
1. The `debounce` function takes in the original function (`func`) and the delay in milliseconds (`delay`).
##
2. Every time the debounced function is called, it clears any previous timer using `clearTimeout()`.
##
3. Then it sets a new timeout (`setTimeout()`), ensuring that the function will only be executed after the specified delay has passed since the last call.
##
4. If the function is called again within the delay period, the timer is reset.

---
## 📊 Example Output
- **Example 1**: If you call `logMessage()` multiple times within `2` seconds, it will only log `"Debounced!"` once, after the final call.

- **Example 2**: Call the debounced function with a 2-second delay. The message `"Debounced!"` will be logged only after 2 seconds of inactivity.

---
## 🚀 Use Cases
- Search Input: Debounce search input to avoid making an API request on every keystroke. 💻

- Window Resize: Only run the resize event handler after the user stops resizing the window. 🖥️

- Button Click: Prevent multiple clicks on a button by debouncing the click event. 🔘

- Scroll Events: Limit the number of times a function runs when a user scrolls. 📜
