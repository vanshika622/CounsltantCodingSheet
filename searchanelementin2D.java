
class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(mat[j][i]==X)
                return 1;
            }
        }
        return 0;
    }
}
