## Problem: Longest Common Prefix (Easy)

**Link:** https://leetcode.com/problems/longest-common-prefix/

### Approach

We start with the first string as the prefix. For every other string, we shorten the prefix until that string starts with the current prefix.

### Complexity

- Time: O(n × m)
- Space: O(1)

### Notes

If there is no common prefix among the strings, the result is an empty string.