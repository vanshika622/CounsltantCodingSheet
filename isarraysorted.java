class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
  int i=0;

        

        while(i<n-1)

        {

            if(arr[i]>arr[i+1])

            return false;

            else

            i++;

        }

        return true;

    }
