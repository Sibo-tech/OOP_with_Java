package BasicSyntax;

import java.util.Scanner;

public class ImperialMetric {

    public static void main(String[] args) {
        Scanner input_mini = new Scanner(System.in);
        System.out.print("Enter the minimum number of feet (not less than 0): ");
        int feet_mini = input_mini.nextInt();
        Scanner input_max = new Scanner(System.in);
        System.out.print("Enter the minimum number of feet (not more than 30): ");
        int feet_max = input_max.nextInt();

        System.out.print("\n   |    0\"    1\"    2\"    3\"    4\"    5\"    6\"    7\"    8\"    9\"   10\"   11\" \n");

        for (double feet=feet_mini; feet <=feet_max; feet++)
        {
            int foot=(int)feet;
            System.out.print(foot+"'");
            System.out.print(" |");
            for( int inches=0;inches<12;inches++)
            {
                System.out.printf("%6.3f",((feet*12+inches)*0.0254));
            }
            System.out.println("");
        }
    }


}
