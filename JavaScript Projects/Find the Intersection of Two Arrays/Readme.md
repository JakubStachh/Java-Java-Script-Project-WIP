# 🔗 Array Intersection

## 📚 Overview
This JavaScript function computes the **intersection** of two arrays. The intersection consists of all the elements that are common to both arrays.

It returns a new array with these common elements.

---

## ⚙️ Function

### `arrayIntersection(arr1, arr2)`

#### 🧾 Parameters:
- `arr1` (Array): The first array of numbers.
- `arr2` (Array): The second array of numbers.

#### 🎯 Returns:
- A new **array** containing the elements that are present in both `arr1` and `arr2`.

---

## 🧪 Example Usage

```javascript
function arrayIntersection(arr1, arr2) {
    return arr1.filter(num => arr2.includes(num));
}

console.log(arrayIntersection([1, 2, 3, 4], [2, 4, 6, 8])); // [2, 4] ✅
console.log(arrayIntersection([1, 3, 5], [2, 4, 6])); // [] ❌
console.log(arrayIntersection([7, 8, 9], [9, 10, 11])); // [9] ✅
```

---
## 🔍 How It Works
1. The function uses the `filter()` method on the first array (`arr1`), checking if each element exists in the second array (`arr2`) using `includes()`.

2. It returns a new array containing only the elements that exist in both arrays.

---
## 📊 Example Output
- Given `arrayIntersection([1, 2, 3, 4], [2, 4, 6, 8])`, the output is `[2, 4]` because `2` and `4` are the common elements.

- For `arrayIntersection([1, 3, 5], [2, 4, 6])`, there are no common elements, so the result is `[]`.

- In the case of `arrayIntersection([7, 8, 9], [9, 10, 11])`, the output is `[9]` because `9` is the only common element.

---
## 🚀 Use Cases
- Finding common elements between datasets 🔄

- Filtering duplicates from multiple sources 📊

- Set operations like intersection in mathematical contexts 🔢

