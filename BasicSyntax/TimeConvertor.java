package BasicSyntax;

import java.util.Scanner;
public class TimeConvertor {public static void main(String[] args) throws Exception {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a time ([h]h:mm [am|pm]):");
    String str = myObj.nextLine();
    String[] am_pm = str.split(" ");
    String[] time = am_pm[0].split(":");
    String hour_minutes=time[0];
    int hour= Integer.parseInt(hour_minutes);
    if(str.endsWith("m"))
    {   if(am_pm[1].equals("am")&& hour!=12)
        {
            System.out.println("0"+hour+":"+time[1]);
        }
        else if(am_pm[1].equals("am") && hour==12)
        {
            System.out.println("0"+(hour-12)+":"+time[1]);
        }
        else if(am_pm[1].equals("pm") && hour<12)
        {
            System.out.println((hour+12)+":"+time[1]);
        }
        else if(am_pm[1].equals("pm") && hour>12)
        {
            System.out.println((hour-12)+":"+time[1]);
        }
        else if(am_pm[1].equals("pm") && hour==12)
        {
            System.out.println((hour)+":"+time[1]);
        }
    }
    else
    {
        if(hour<12)
        {
            System.out.println((hour+12)+":"+time[1]+" am");
        }
        else if(hour>12)
        {
            System.out.println((hour-12)+":"+time[1]+" pm");
        }
    }

}
}