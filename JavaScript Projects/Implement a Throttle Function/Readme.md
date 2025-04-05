# 🕹️ Throttle Function

## 📚 Overview
The **throttle** function is a technique used to control the frequency of function execution. It ensures that a function is executed at most once within a specified time interval (the "limit"), even if the function is triggered multiple times during that period. 

This is particularly useful for managing high-frequency events such as **scrolling**, **resizing**, and **mouse movements**, where you only want the function to run at a controlled pace rather than on every event.

---

## ⚙️ Function

### `throttle(func, limit)`

#### 🧾 Parameters:
- `func` (Function): The function to be throttled.
- `limit` (Number): The time interval (in milliseconds) that should pass before `func` can be called again.

#### 🎯 Returns:
- A throttled version of the provided function, which ensures that `func` is called at most once every `limit` milliseconds.

---

## 🧪 Example Usage

```javascript
function throttle(func, limit) {
    let lastFunc;
    let lastRan;
    return function () {
        const context = this, args = arguments;
        if (!lastRan) {
            func.apply(context, args);
            lastRan = Date.now();
        } else {
            clearTimeout(lastFunc);
            lastFunc = setTimeout(() => {
                if ((Date.now() - lastRan) >= limit) {
                    func.apply(context, args);
                    lastRan = Date.now();
                }
            }, limit - (Date.now() - lastRan));
        }
    };
}

const logMessageThrottled = throttle(() => console.log("Throttled!"), 2000);

logMessageThrottled(); // Executes immediately, but will wait 2s before running again
```

---
## 🔍 How It Works
1. The `throttle` function returns a new function that controls the execution of the provided `func`.
##
2. When the throttled function is called:

    - If `func` has not run within the last `limit` milliseconds, it is executed immediately.

    - If it has been called recently, the execution is delayed until the next available time after the `limit` has passed.
##
3. The function is controlled by two key variables:

    - `lastRan`: Stores the time when `func` was last executed.

    - `lastFunc`: Used to store the timeout ID for delaying the function call.

---
## 📊 Example Output
- **Example 1**: The first call of `logMessageThrottled()` triggers the immediate execution of `"Throttled!"`.

- **Example 2**: If called again within the next `2` seconds, the function will be delayed until the 2-second window has passed.

---
## 🚀 Use Cases
- **Scroll Events**: Throttle the execution of a function that triggers on scrolling to prevent it from firing too frequently. 📜

- **Resize Events**: Limit how often the resize handler runs during window resizing. 🖥️

- **Mouse Movements**: Control the frequency of actions on mousemove events to improve performance. 🖱️

- **API Calls**: Throttle requests to an API to prevent overwhelming the server with too many requests in a short period. 🌐
