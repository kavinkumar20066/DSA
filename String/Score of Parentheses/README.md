# 856. Score of Parentheses

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/score-of-parentheses/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=flat-square)

## Problem Statement

Given a balanced parentheses string s, return the score of the string.

The score of a balanced parentheses string is based on the following rule:


	"()" has score 1.
	AB has score A + B, where A and B are balanced parentheses strings.
	(A) has score 2 * A, where A is a balanced parentheses string.


 
Example 1:

Input: s = "()"
Output: 1


Example 2:

Input: s = "(())"
Output: 2


Example 3:

Input: s = "()()"
Output: 2


 
Constraints:


	2 <= s.length <= 50
	s consists of only '(' and ')'.
	s is a balanced parentheses string.

## Examples

```
Input: s = "()"
Output: 1

Input: s = "(())"
Output: 2

Input: s = "()()"
Output: 2
```

## Constraints

- "()" has score 1.
- AB has score A + B, where A and B are balanced parentheses strings.
- (A) has score 2 * A, where A is a balanced parentheses string.

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*