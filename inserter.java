import java.util.*;
class inserter 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim()+" ";
        if(input.charAt(input.length()-2)!='.'&&input.charAt(input.length()-2)!='?'&&input.charAt(input.length()-2)!='!')
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println("WORD TO BE INSERTED : ");
        String wrd=sc.next(),output="",nw="";
        System.out.println("WORD POSITION IN THE SENTENCE : ");
        int pos=sc.nextInt(),f=1;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
                if(ch!=' ')
                nw=nw+ch;
                else if(nw.length()>0)
                {
                    f++;
                    output=output+nw.trim()+" ";
                    nw="";
                }
                if(f==pos)
                    {
                        output=output+wrd+" ";
                        f++;
                    }
        }
        System.out.println(output);
    }
}
