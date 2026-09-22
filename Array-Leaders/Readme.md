# Array Leaders

## Problem Statement

You are given an array `arr` of positive integers. An element is called a **leader** if it is greater than or equal to all the elements present on its right side.

The **rightmost element is always a leader** because there are no elements to its right.

### Example

```text
Input:
arr = [16, 17, 4, 3, 5, 2]

Output:
[17, 5, 2]
```

### Explanation

* `2` is the rightmost element, so it is a leader.
* `5 >= 2`, so `5` is a leader.
* `3` is not a leader because `5` is greater than `3`.
* `4` is not a leader because `5` is greater than `4`.
* `17 >= 4, 3, 5, 2`, so `17` is a leader.
* `16` is not a leader because `17` is greater than `16`.

Therefore, the leaders are:

```text
[17, 5, 2]
```

---

## Approach

The easiest way to solve this problem efficiently is to traverse the array **from right to left**.

### Steps

1. Start from the last element.
2. Keep track of the maximum element seen so far from the right.
3. If the current element is greater than or equal to `maxRight`, it is a leader.
4. Add that element to the answer.
5. Update `maxRight`.
6. Since we traverse from right to left, reverse the answer at the end.

### Why Right to Left?

For every element, we need to know the maximum value on its right.

By traversing from right to left, we can maintain this maximum in a single variable instead of repeatedly checking all elements on the right.

---

## Java Solution

```java
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int maxRight = arr[arr.length - 1];
        ans.add(maxRight);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            
            if (arr[i] >= maxRight) {
                ans.add(arr[i]);
                maxRight = arr[i];
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
```

---

## Dry Run

For:

```text
arr = [16, 17, 4, 3, 5, 2]
```

Traverse from right to left:

| Element | `maxRight` | Leader? | Answer       |
| ------- | ---------: | ------- | ------------ |
| 2       |          2 | Yes     | `[2]`        |
| 5       |          5 | Yes     | `[2, 5]`     |
| 3       |          5 | No      | `[2, 5]`     |
| 4       |          5 | No      | `[2, 5]`     |
| 17      |         17 | Yes     | `[2, 5, 17]` |
| 16      |         17 | No      | `[2, 5, 17]` |

Before reversing:

```text
[2, 5, 17]
```

After reversing:

```text
[17, 5, 2]
```

---

## Another Example

```text
Input:
arr = [10, 4, 2, 4, 1]

Output:
[10, 4, 4, 1]
```

Notice that both `4`s are leaders because the condition is:

```text
arr[i] >= maxRight
```

not:

```text
arr[i] > maxRight
```

So equal elements are also considered leaders.

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

Each element is visited only once.

### Space Complexity

```text
O(n)
```

The answer list can contain up to `n` elements.

---

## Key Concept

The important idea is:

> **Traverse from right to left and maintain the maximum element seen so far.**

This avoids the brute-force approach of checking every element against all elements on its right.

---

## Constraints

* `1 ≤ arr.size() ≤ 10^6`
* `0 ≤ arr[i] ≤ 10^6`

---

## Tags

* Array
* Leaders in Array
* GFG
* Java
* Array Traversal
* Easy
* Problem Solving

## Companies

* PayU
* Adobe
* Amazon
