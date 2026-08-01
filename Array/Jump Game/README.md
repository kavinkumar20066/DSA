# 55. Jump Game

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/jump-game/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-eab308?style=flat-square)

## Problem Statement

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 
Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.


Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


 
Constraints:


	1 <= nums.length <= 104
	0 <= nums[i] <= 105

## Examples

```
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
```

## Constraints

- 1 <= nums.length <= 104
- 0 <= nums[i] <= 105

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*