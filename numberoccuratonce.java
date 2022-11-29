class Sol
{
    public static int search(int A[], int N)
    {
        int ans=0;
        for(int i=0;i<N;i++)
        {
            ans=ans^A[i];
        }
        return ans;
    }
}
