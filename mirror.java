import java.util.*;
public class mirror 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M = ");
        int M=sc.nextInt();
        System.out.print("N = ");
        int N=sc.nextInt();
        int input[][]=new int[M][N];
        int output[][]=new int[M][N];
        for(int i=0;i<M;i++)
            for(int j=0;j<N;j++)
                input[i][j]=sc.nextInt();
        if((M+N)>4&&(M+N)<20)
        {
            System.out.println("ORIGNAL MATRIX");
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                System.out.print(input[i][j]+"\t");
                System.out.println("");
            }
            for(int i=0;i<N;i++)
                for(int j=0;j<M;j++)
                  output[j][N-1-i]=input[j][i]; 
            System.out.println("MIRROR MATRIX");
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                System.out.print(output[i][j]+"\t");
                System.out.println(" ");
            }
            System.out.println("SUM OF CORNER ELEMENTS ="+(input[0][0]+input[M-1][0]+input[0][N-1]+input[M-1][N-1]));
        }
        else
        System.out.println("INVALID INPUT");
    }
}
