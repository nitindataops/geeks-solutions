# Value Equal to Position

## Problem Statement

Given an array `arr[]`, find all the elements whose value is equal to the position where they appear.

The array positions are considered using **1-based indexing**.

If an element satisfies:

```text
arr[i] = i + 1
```

then its position is added to the answer.

There can be more than one such element.

---

## Example 1

```text
Input:
arr[] = [15, 2, 45, 4, 7]

Output:
[2, 4]
```

### Explanation

Using 1-based indexing:

* Position `1` → `15` → not equal
* Position `2` → `2` → equal, so add `2`
* Position `3` → `45` → not equal
* Position `4` → `4` → equal, so add `4`
* Position `5` → `7` → not equal

Therefore:

```text
[2, 4]
```

---

## Example 2

```text
Input:
arr[] = [1]

Output:
[1]
```

### Explanation

At position `1`:

```text
arr[1] = 1
```

So `1` is added to the answer.

---

## Approach

In Java, arrays use **0-based indexing**, but the problem uses **1-based positions**.

Therefore, for every index `i`, the actual position is:

```text
i + 1
```

We simply check:

```text
arr[i] == i + 1
```

If the condition is true, add `arr[i]` to the answer.

---

## Java Solution

```java
class Solution {
    public static ArrayList<Integer> valueEqualToIndex(List<Integer> nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == i + 1) {
                ans.add(nums.get(i));
            }
        }
        
        return ans;
    }
}
```

---

## Dry Run

For:

```text
arr = [15, 2, 45, 4, 7]
```

| Index | Position | Value | Equal? |
| ----: | -------: | ----: | ------ |
|     0 |        1 |    15 | No     |
|     1 |        2 |     2 | Yes    |
|     2 |        3 |    45 | No     |
|     3 |        4 |     4 | Yes    |
|     4 |        5 |     7 | No     |

Answer:

```text
[2, 4]
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

We traverse the array only once.

### Auxiliary Space

```text
O(1)
```

Apart from the required output array, no extra space is used.

---

## Key Concept

The main thing to remember is that **GFG uses 1-based position in this problem, while Java arrays use 0-based indexing**.

Therefore:

```text
Position = index + 1
```

and the condition is:

```text
arr[i] == i + 1
```

---

## Constraints

* `1 ≤ arr.size() ≤ 10^5`
* `1 ≤ arr[i] ≤ 10^6`

---

## Tags

* Array
* Searching
* Java
* GFG
* Basic
* Array Traversal
