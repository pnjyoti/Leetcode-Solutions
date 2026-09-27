## Problem: Reverse Linked List

**LeetCode:** https://leetcode.com/problems/reverse-linked-list/

**Problem Number:** 206

### Approach

We reverse the linked list using three references: previous, current, and nextNode.

For each node, we save the next node, change the current node's next pointer to the previous node, and then move the previous and current pointers forward.

### Complexity

- Time: O(n)
- Space: O(1)

### Test Cases

#### Test Case 1
Input:
1 -> 2 -> 3 -> 4 -> 5

Output:
5 -> 4 -> 3 -> 2 -> 1

#### Test Case 2
Input:
1

Output:
1

### Notes

The solution reverses the linked list in-place without creating a new linked list.
