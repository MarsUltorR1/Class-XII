import java.util.*;
class incdebounce
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        String input=sc.nextLine();
        for(int i=0;i<input.length();i++)
            if(Character.isDigit(input.charAt(i))==false)
            {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
        boolean f=false,z=false;
        for(int i=0;i<input.length()-1;)
        if(input.charAt(i)<=input.charAt(++i))
        f=true;
        else 
        {
            f=false;
            break;
        }
        if(f)
        System.out.println(input+" IS AN INCREASING NUMBER");
        for(int i=0;i<input.length()-1;)
        if(input.charAt(i)>=input.charAt(++i))
        z=true;
        else 
        {
            z=false;
            break;
        }
        if(z)
        System.out.println(input+" IS AN DECREASING NUMBER");
        if(f==false&&z==false)
        System.out.println(input+ " IS A BOUNCY NUMBER");
    }
}