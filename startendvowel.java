import java.util.*;
class startendvowel
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().toUpperCase();
        if(input.charAt(input.length()-1)!='.'&&input.charAt(input.length()-1)!='?'&&input.charAt(input.length()-1)!='!')
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        input=input.substring(0, input.length()-1)+" ";
        String nw="",output1="",output2="";
        int f=0;
        for(int i=0;i<input.length();i++)    
        {
            char ch=input.charAt(i);
            if(ch!=' ')
            nw=nw+ch;
            else
            {
                if("AEIOUaeiou".indexOf(nw.charAt(0))!=-1 &&"AEIOUaeiou".indexOf(nw.charAt(nw.length()-1))!=-1)
                {
                    output1=output1+" "+nw;
                    f++;
                }
                else
                    output2=output2+" "+nw;
                nw="";
            }
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL ="+f);
        System.out.println(((output1.trim())+" "+output2).trim());
    }
}
