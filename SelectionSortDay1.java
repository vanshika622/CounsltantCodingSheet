class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return 0;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	   for(int i=0;i<n;i++){
	       int min_idx=i;
	       for(int j=i+1;j<n;j++){
	           if(arr[j]<arr[min_idx])
	              min_idx=j;
	              
	              
	       }
	       int temp=arr[min_idx];
	       arr[min_idx]=arr[i];
	       arr[i]=temp;
	   }
	}
}
