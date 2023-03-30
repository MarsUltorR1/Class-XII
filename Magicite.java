import java.util.*;  
public class Magicite 
{  
    static boolean Composite(int n)
    {
        for(int i=2;i<n/2;i++)
        if(n%i==0)
        return true;
        return false;
    }
    public static void main(String args[])  
        {  
            Scanner sc = new Scanner(System.in);      
            System.out.print("m = ");  
            int m= sc.nextInt();
            System.out.print("n = ");  
            int n= sc.nextInt();
            if(m>n)
            {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
            int f=0;
            System.out.println("THE COMPOSITE MAGIC INTEGERS ARE : ");
            for(int i=m;i<=n;i++)  
            if(magicNumber(i)&&Composite(i))
            {  
                System.out.print(i+",");
                f++;
            }   
            System.out.println();
            System.out.println("FREQUENCY OF COMPOSITE MAGIC INTEGERS ARE : "+f);
        }  
    static boolean magicNumber(int n)  
    {  
        if(((n-1)%9)==0)  
        return true;  
        else  
        return false;  
    }  
}  
