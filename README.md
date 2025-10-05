#  Heap Sort – Assignment 2 (Pair 2, Student B)

##  Project Overview

This project is part of **Assignment 2 – Algorithmic Analysis and Peer Review**.  
As **Student B** from **Pair 2**, I implemented the **Heap Sort** algorithm (in-place version with bottom-up heapify).  
The main goals of the assignment were:

-  Implement a fundamental sorting algorithm with clean, documented code  
-  Write unit tests for edge cases  
-  Perform asymptotic analysis and complexity justification  
-  Measure real-world performance and compare with theoretical predictions  
-  Submit a detailed peer-review analysis of the partner’s algorithm (Shell Sort)

---

##  Algorithm Description

Heap Sort is a comparison-based, in-place sorting algorithm that builds a **max heap** and repeatedly extracts the largest element. It guarantees `O(n log n)` time complexity in all cases and uses only `O(1)` extra memory.

Steps:
1. Build a max heap from the input array (`O(n)`)
2. Swap the first and last elements
3. Reduce the heap size and restore the heap property (`O(log n)`)
4. Repeat until the array is sorted

---

##  Complexity Analysis

| Case              | Time Complexity | Space Complexity |
|-------------------|------------------|------------------|
| Best (Ω)          | Ω(n log n)       | O(1)             |
| Average (Θ)       | Θ(n log n)       | O(1)             |
| Worst (O)         | O(n log n)       | O(1)             |

---

##  Performance Results

Benchmarks were measured using `System.nanoTime()` on random integer arrays:

| Input Size (n) | Execution Time (ms) |
|----------------|----------------------|
| 100            | 0.10                |
| 1,000          | 0.82                |
| 10,000         | 8.73                |
| 100,000        | 96.88               |

 The results confirm the theoretical `O(n log n)` growth pattern.  
 Performance remains consistent even for reverse-sorted or duplicate-heavy arrays.

---

## Project Structure

