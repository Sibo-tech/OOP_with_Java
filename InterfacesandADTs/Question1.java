package InterfacesandADTs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question1 {
    public static void main(String[]args){
        System.out.println("Enter option: (1) add soft drink (2) quit:");
        Scanner drink= new Scanner(System.in);
        Soda soda=new Soda();
        int input= drink.nextInt();
        while(true){
            int quit=2;
            if(input==quit){
                System.out.println(soda.getSoda());
                break;
            }else if(input==1){
                soda.setSoda();
                System.out.println("Enter option: (1) add soft drink (2) quit:");
                input=drink.nextInt();
            }
        }
    }
    static class Soda{
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        public void setSoda(){
            System.out.println("Enter name, colour and volume in ml separated by space");
            String drink=myObj.nextLine();
            list.add(drink);
            //list.add(drink);
            //list.add(drink);
        }
        public String getSoda(){
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));}
            return "";
        }
    }
}
