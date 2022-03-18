# Pizza-Shop
Using Data Structure and Algorithms in java, I got 2 solutions for this Project

![image](https://user-images.githubusercontent.com/101879759/159065164-1f379ee8-abae-437e-ae49-312145b28377.png)

❖ Pseudocode:
1. Insert required pizza slices by travelers to a priority queue
2. Insert all pizza slices to a different priority queue
3. Empty both the priority queues in an array for each
4. Iterate over the array of pizza to find the suitable pizza slice for the i-th traveler in the travelers array if there’s any suitable slice (s) output both of the slice size & required size by traveler, then do the same operation to i+1 th traveler starting from the index of s+1 in the sorted pizza array if there’s not any suitable slice stop and output “Couldn’t satisfy all the travelers, Otherwise output “All the travelers have been satisfied”.
❖ Total Complexity → O(nlogn)
❖ Analysis:
Step 1: nlogn
Step 2: nlogn
Step 3: nlogn*2
Step 4: n
= (nlogn)*4+n =O(nlogn)


![image](https://user-images.githubusercontent.com/101879759/159065259-97ce8515-3d33-4352-a589-521511d25a5d.png)
❖ Pseudocode:
1. Sort required size of pizza by each traveler ascendingly
2. Sort the available pizza slices according to size ascendingly
3. Iterate over sorted pizza slices to find the suitable pizza slice for the i-th traveler in the sorted array if there’s any suitable slice (s) output both of the slice size & required size by traveler, then do the same operation to i+1 th traveler proceeding from the index of s+1 in the sorted pizza array if there’s not any suitable slice stop and output “Couldn’t satisfy all the travelers, Otherwise output “All the travelers have been satisfied”.
**it’s step 3 in solution 1**
❖ Total complexity → O(n)
❖ Analysis:
Step 1: (n+k)
Step 2: (n+k)
Step 3: (n)
= (n+k)*2+n = O(n)
Note : Based on step 3 both of the solution 2 & 1 they are considered to be greedy algorithms since they solve an optimization problem by taking the minimum possible size of slice to satisfy the pilot (minimization)
