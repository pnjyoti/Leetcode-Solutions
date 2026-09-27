## Problem: Binary Search (Easy)

**Link:** https://leetcode.com/problems/binary-search/

### Approach

We use two pointers, left and right, to represent the current search range. We repeatedly check the middle element and eliminate half of the search range based on whether the target is greater or smaller.

### Complexity

- Time: O(log n)
- Space: O(1)

### Notes

Binary search requires the input array to be sorted. If the target is not present, the method returns -1.