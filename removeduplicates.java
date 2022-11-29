class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<N;i++){
            if(!arr.contains(A[i])){
                arr.add(A[i]);
            }
        }
        return arr.size();
    }
}
