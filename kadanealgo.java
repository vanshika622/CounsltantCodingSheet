class Solution{

   
    long maxSubarraySum(int arr[], int n){
        
       int sum = Integer.MIN_VALUE; 
        int temp= 0;
        
        for(int i=0 ; i < n ;i++)
        {
            temp+= arr[i];
            if(sum<temp)
            {
                sum = temp;
            }
            if(temp<0)
            {
                temp=0;
            }
            
        }
        
        return maxsum;
        
    }
    
}
