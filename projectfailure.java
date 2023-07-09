
import java.util.*;
class projectfailure
{
    static int point;
    static int modays[]={31,28,31,30,31,30,31,31,30,31,30,31};
    static void display(int day,int month,int year,String dayofweek)
    {
        String array[]={ "SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int count=90;
        for(int i=0;i<array.length;i++)
        if(array[i].equalsIgnoreCase(dayofweek))
        point=i;
        while(count>0)
        {
            day++;
            count--;
            if(day>modays[month])
            {
                day=1;
                month++;
                if(month==12)
                {
                    month=0;
                    year++;
                    if(year%4==0)
                    modays[1]=29;
                }   
            }
            if(point==7)
            point=0;
            point++;
        }
        if(day-1==0)
        System.out.println(modays[month-1]+"/"+(month)+"/"+year);
        else
        System.out.println((day-1)+"/"+(month+1)+"/"+year);
        System.out.println("DAY OF WEEK : "+array[point-1]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter project date :");
        String input=sc.nextLine();
        System.out.println("day of week : ");
        String dayofweek=sc.nextLine();
        String array[]={ "SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int day=Integer.parseInt(input.substring(0, input.indexOf('/'))),month=Integer.parseInt(input.substring(input.indexOf('/')+1,input.lastIndexOf('/')))-1,year=Integer.parseInt(input.substring(input.lastIndexOf('/')+1));
        if(day>modays[month]||month>12||year>9999)
        {  
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.print("PROJECT SUBMISSION DATE : ");
        display(day,month,year,dayofweek);
        if(array[point-1]=="SUNDAY")
        {
            System.out.print("PROJECT TO BE SUBMITTED : ");
            display(day+1,month,year,"WEDNESDAY");
        }
    }
}