class Solution {
    
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void pushZerosToEnd(int[] arr, int n) {
       
int count=0;

     for(int i=0;i<n;i++){

         if(arr[i]==0){

             count++;

         }

         else if(arr[i]!=0 && count!=0){

             swap(arr,i,i-count);

         }

     }
    }
}
