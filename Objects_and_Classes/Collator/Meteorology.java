package Objects_and_Classes.Collator;


import java.util.Scanner;
import java.util.concurrent.Callable;
import java.text.DecimalFormat;
public class Meteorology {
    public static void main(final String[] args) {
        System.out.println("Meteorology Program");
        String options=("Make a selection and press return: \n" +
                "1. Record a temperature reading.\n" +
                "2. Record a pressure reading.\n" +
                "3. Record a humidity reading.\n" +
                "4. Print maximum values.\n" +
                "5. Print minimum values.\n" +
                "6. Print average values.\n" +
                "7. Quit.");
        System.out.println(options);

        Collator temp= new Collator("Temperature");
        Collator pres= new Collator("Pressure");
        Collator hum= new Collator("Humidity");
        Scanner myObj = new Scanner(System.in);
        int input = myObj.nextInt();
        while(true){
            int quit=7;
            if (quit==input) {
                break;
            }
            if(input==1){
                System.out.println("Enter value");
                int T = myObj.nextInt();
                temp.recordReading(T);
                System.out.println(options);
                input=myObj.nextInt();

            }
            if(input==2){
                System.out.println("Enter value");
                int P = myObj.nextInt();
                pres.recordReading(P);
                System.out.println(options);
                input=myObj.nextInt();
            }
            if(input==3){
                System.out.println("Enter value");
                int H = myObj.nextInt();
                hum.recordReading(H);
                System.out.println(options);
                input=myObj.nextInt();
            }
            if(input==4){

                if(temp.maximum()==0){
                    System.out.println("Maximum temperature:-");}
                else{
                System.out.println("Maximum temperature: "+temp.maximum());}
                if(pres.maximum()==0){
                    System.out.println("Maximum pressure:-");
                }else{
                    System.out.println("Maximum pressure: "+pres.maximum());}
                if(hum.maximum()==0){
                    System.out.println("Maximum humidity:-");
                }else{
                    System.out.println("Maximum humidity: "+hum.maximum());}
                System.out.println(options);
                input=myObj.nextInt();
            }
            if(input==5){
                if(temp.minimum()==0){
                    System.out.println("Minimum temperature:-");}
                else{
                    System.out.println("Minimum temperature: "+temp.minimum());}
                if(pres.minimum()==0){
                    System.out.println("Minimum pressure:-");
                }else{
                    System.out.println("Minimum pressure: "+pres.minimum());}
                if(hum.minimum()==0){
                    System.out.println("Minimum humidity:-");
                }else{
                    System.out.println("Minimum humidity: "+hum.minimum());}
                System.out.println(options);
                input=myObj.nextInt();
            }
            if(input==6){
                String doubleT = String.format("%.2f", temp.average());
                String doubleP = String.format("%.2f", pres.average());
                String doubleH = String.format("%.2f", hum.average());
                System.out.println("Average temperature: "+doubleT);
                System.out.println("Average pressure: "+doubleP);
                System.out.println("Average humidity: "+doubleH);
                System.out.println(options);
                input=myObj.nextInt();
            }

        }
}}
