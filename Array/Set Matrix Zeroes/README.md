# 73. Set Matrix Zeroes

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/set-matrix-zeroes/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-eab308?style=flat-square)

## Problem Statement

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 
Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]


Example 2:

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


 
Constraints:


	m == matrix.length
	n == matrix[0].length
	1 <= m, n <= 200
	-231 <= matrix[i][j] <= 231 - 1


 
Follow up:


	A straightforward solution using O(mn) space is probably a bad idea.
	A simple improvement uses O(m + n) space, but still not the best solution.
	Could you devise a constant space solution?

## Examples

```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```

## Constraints

- m == matrix.length
- n == matrix[0].length
- 1 <= m, n <= 200
- -231 <= matrix[i][j] <= 231 - 1

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*