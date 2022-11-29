class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    void reverse(int [] arr,int i,int j){
        
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
        
    }
}
