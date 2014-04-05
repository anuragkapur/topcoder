Problem Statement
=================

<pre>    
Monte-Carlo is an amoeba. Amoebas can feed on gel: whenever an amoeba encounters a piece of gel that is exactly as big as the amoeba, the amoeba will consume the gel and thus double its size.  Initially, the size of Monte-Carlo was some unknown positive integer. During its lifetime, Monte-Carlo encountered several gels and consumed the ones it could.  You are given a int[] X. The elements of X are the sizes of gels Monte-Carlo encountered, in chronological order.  Let S be the set of all possible final sizes of Monte-Carlo. Compute and return the number of positive integers that do not belong into S.
Definition
    
Class:
AmebaDiv1
Method:
count
Parameters:
int[]
Returns:
int
Method signature:
int count(int[] X)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Notes
-
It is possible to prove that the answer for any test case is finite and fits into a 32-bit signed integer type.
Constraints
-
X will contain between 1 and 200 integers, inclusive.
-
Each element of X will be between 1 and 1,000,000,000, inclusive.
Examples
0)

    
{3,2,1}
Returns: 2
Here are a few possibilities how Monte-Carlo's life could have looked like:
Monte-Carlo started with size 1, ignored gel #0, ignored gel #1, consumed gel #2 and thus reached size 2.
Monte-Carlo started with size 3, consumed gel #0 and thus reached size 6, and then ignored the next two gels (as they were too small).
Monte-Carlo started with size 47 and ignored all three gels.
All final sizes except for 1 and 3 are possible.
1)

    
{2,2,2,2,2,2,4,2,2,2}
Returns: 2
If Monte-Carlo starts with size 2, its life will look as follows: First, it will consume gel #0 and thus grow to 4. Later, after ignoring a few gels, Monte-Carlo will consume gel #6 (the one with size 4) and thus grow to 8.  It can be shown that for this X Monte-Carlo's final size can never be 2 or 4.
2)

    
{1,2,4,8,16,32,64,128,256,1024,2048}
Returns: 11

3)

    
{854,250,934,1000,281,250,281,467,854,562,934,1000,854,500,562}
Returns: 7

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
</pre>