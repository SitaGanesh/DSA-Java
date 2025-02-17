# Recursion Topics and Practice Problems

## Topics

1. What is recursion
2. Print numbers in decreasing order
3. Print numbers in increasing order
4. Find Factorial of N
5. Print sum of N numbers
6. Print Nth Fibonacci number
7. Check if array is sorted or not
8. First Occurrence
9. Last Occurrence
10. Print x to the power n
11. Print x to the power n optimized
12. Tiling Problem
13. Remove Duplicates in a string
14. Finding Pairing Problem
15. Binary String Problem

## Practice Set Problems

1. For a given integer array of size N, find all the occurrences (indices) of a given element (key) and print them. Use a recursive function to solve this problem.

2. You are given a number (e.g., 2025), convert it into a string of English words like "two zero two five". Use a recursive function to solve this problem.
   - Note: The digits of the number will be only in the range 0-9 and the last digit of a number can't be 0.

3. Write a program to find the length of a string using recursion.

4. We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.
   - **Sample Input:** S = 'abcab'
   - **Sample Output:** 7
     - There are 15 substrings of "abcab": a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
     - Out of the above substrings, there are 7 substrings: a, abca, b, bcab, c, a, and b. So only 7 contiguous substrings start and end with the same character.
   - **Sample Input 2:** S = "aba"
   - **Sample Output 2:** 4
     - The substrings are a, b, a, and aba.

5. You have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints:
   1. Only one disk can be moved at a time.
   2. A disk is slid off the top of one tower onto another tower.
   3. A disk cannot be placed on the top of a smaller disk. Write a program to move the disks from the first tower to the last using stacks.
   - Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'
   - An example with 2 disks (i.e., N = 2):
     - Step 1: Shift the first disk from 'A' to 'B'
     - Step 2: Shift the second disk from 'A' to 'C'
     - Step 3: Shift the first disk from 'B' to 'C'