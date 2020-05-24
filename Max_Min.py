//  In this question <>
   An array is given and the task is to find the subarray of given length k  such that  difference b/w the max element and min element of that subarray is minimum
   //here is the function....
   
   
    def maxMin(k, arr):
    n=len(arr)
    arr = sorted(arr)
    minimum=10**9
    for i in range(n-k+1):
        minimum=min(minimum,arr[(i+k-1)]-arr[i])
    return minimum



//   Sample Input 1

10 => length of array
4 => k
arr[i] => 1 2 3 4 10 20 30 40 100 200

Sample Output1 => 3

Explanation 1

Here k=4 ; selecting the  integers , unfairness equals

max(1,2,3,4) - min(1,2,3,4) = 4 - 1 = 3
