
class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        long max = 0;
        
        for (int i = 1; i < N; i++) {
            max = Math.max(arr[i-1] + arr[i], max);
        }
        return max;
    }
}
