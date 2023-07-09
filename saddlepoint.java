import java.util.*;
class saddlepoint
{
    static int A[][];
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("N =");
        int N=sc.nextInt();
        if(N>20||N<2)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        A=new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                A[i][j]=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            System.out.print(A[i][j]+"\t");
            System.out.println(" ");
        }
        boolean print=true;
        for(int i=0;i<N;i++)
        {
            for(int k=0;i<N;i++)
            if(sadrow(i,1)==sadrow(k,2))
            {
                System.out.println(sadrow(i,1));
                print =false;
            }
        }
        if(print)
        System.out.println("NO SADDLE POINT");
        System.out.println("MATRIX AFTER SORTING THE PRINCIPAL DIAGONAL");
        for(int i=0;i<A.length;++i)
        {
            int j = i;
            while(j > 0 && A[j-1][j-1]>A[j][j]){
    
              int key = A[j][j];
              A[j][j] = A[j-1][j-1];
              A[j-1][j-1] = key;
              j = j-1;
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            System.out.print(A[i][j]+"\t");
            System.out.println(" ");
        }
    }
    static int sadrow(int r,int p)
    {
        int output=A[r][0];
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A.length-i;j++)
            {
                if(p==1)
                    if(A[r][i]>A[r][j])
                        output=A[r][j];
                if(p==2)
                    if(A[i][r]<A[j][r])
                    output=A[j][r];
            }
        return output;
    }
}