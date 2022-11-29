class Solution {
   void rearrange(int arr[], int n) {
	    int ne[] = new int[n];
	    int po[] = new int[n];
	    int nec = 0 ,poc = 0;
	    for(int i = 0 ; i < n; i++){
	        if(arr[i] < 0){
	            ne[nec++]= arr[i];
	        }else{
		        po[poc++]= arr[i];            
	        }
	    }
	    
	    int i =  0 ,j = 0 ,k = 0 ;
	    
	    while(i < poc && j < nec){
	        if(k >= n)
	            break ;
	        arr[k++] = po[i];
	        if(k >= n)
	            break ;
	        arr[k++] = ne[j];
	        i++;
	        j++;
	    }
	    
	    while(i < poc){
	       arr[k] = po[i];
	       k++;
	       i++;
	    }
	    
	    while(j < nec){
	       arr[k] = ne[j];
	       k++;
	       j++;
	    }
	}
	
}
