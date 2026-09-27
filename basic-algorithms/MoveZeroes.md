## Problem: Move Zeroes (Easy)

**Link:** https://leetcode.com/problems/move-zeroes/

### Approach

We move all non-zero elements toward the beginning of the array while maintaining their relative order. After placing all non-zero elements, we fill the remaining positions with zeroes.

### Complexity

- Time: O(n)
- Space: O(1)

### Notes

The operation must be performed in-place, and the relative order of the non-zero elements must remain unchanged.