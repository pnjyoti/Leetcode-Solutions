## Problem: Valid Anagram (Easy)

**Link:** https://leetcode.com/problems/valid-anagram/

### Approach

We use a frequency array to count the occurrences of each lowercase letter. We increment the count for characters in the first string and decrement it for characters in the second string.

### Complexity

- Time: O(n)
- Space: O(1)

### Notes

If the two strings have different lengths, they cannot be anagrams.