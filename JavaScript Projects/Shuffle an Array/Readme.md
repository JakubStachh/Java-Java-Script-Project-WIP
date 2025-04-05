# 🔀 Shuffle Array Function

## 📚 Overview
The **shuffleArray** function takes an array as input and returns a new array with its elements shuffled in a random order. The function uses **sort()** with a random comparator to mix up the elements.

---

## ⚙️ Function

### `shuffleArray(arr)`

#### 🧾 Parameters:
- `arr` (Array): The array that you want to shuffle.

#### 🎯 Returns:
- A new array with the elements shuffled in a random order.

---

## 🧪 Example Usage

```javascript
function shuffleArray(arr) {
    return arr.sort(() => Math.random() - 0.5);
}

console.log(shuffleArray([1, 2, 3, 4, 5])); // Random order
```

---
## 🔍 How It Works
1. `sort()`: The array is sorted using a custom comparator function.
##
2. `Math.random() - 0.5`: The comparator generates a random number between `-0.5` and `0.5`. This causes the elements to be sorted randomly by the built-in `sort()` method:

   - When the result is positive, the elements are swapped.

   - When the result is negative, the elements stay in the same order.

   - The randomness comes from the `Math.random()` function, which produces a pseudo-random float between `0` and `1`.

---
## 📊 Example Output
- **Input**: `[1, 2, 3, 4, 5]`

- **Output**: `[3, 1, 5, 2, 4]` (example output, will vary each time)

---
## 🚀 Use Cases
- **Randomization**: Useful for shuffling decks of cards, randomizing lists, or any situation where you need a random order of elements.

- **Games & Simulations**: Essential for games that require random element order, such as card games, lottery simulations, or random draws.

- **UI/UX**: Can be used in web development for randomizing elements or refreshing content in a random order.

