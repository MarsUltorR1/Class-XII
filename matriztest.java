import java.util.*;
public class matriztest 
{
    public static void main(String[] args) 
    {
        int A[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int N=3;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            System.out.print(A[i][j]+"\t");
            System.out.println(" ");
        }
        System.out.println(A[2][0]);
    }    

}
/*import java.util.*;
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
        {
            for(int j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            System.out.print(A[i][j]+"\t");
            System.out.println(" ");
        }
        System.out.println("output  row = "+sadrow(1));
        System.out.println("output column = "+sadcol(1));
    }
    static int sadrow(int r)
    {
        int output=A[r][0];
        int pointer=0;
        for(int i=0;i<A.length;i++)
        {
            pointer=A[r][i];
            for(int j=0;j<A.length-i;j++)
            {
                if(pointer>A[r][j])
                    output=A[r][j];
            }
        }
        return output;
    }
    static int sadcol(int c)
    {
        int output=A[0][c];
        int pointer=0;
        for(int i=0;i<A.length;i++)
        {
            pointer=A[i][c];
            for(int j=0;j<A.length-i;j++)
                if(pointer<A[j][c])
                output=A[j][c];
        }
        return output;
    }
} */