class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int ans=-1;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                ans=arr[i];
                break;
            }
        }
        return ans;
    }
}
