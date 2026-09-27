## Problem: Two Sum (Easy)

**Link:** https://leetcode.com/problems/two-sum/

### Approach

We check every pair of elements in the array using two loops. If the sum of two elements equals the target, we return their indices.

### Complexity

- Time: O(n²)
- Space: O(1)

### Notes

The two indices must be different. The duplicate-value case [3, 3] with target 6 is an important test case.