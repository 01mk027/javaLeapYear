import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creating variables and instance of Scanner class
        int year;
        Scanner input = new Scanner(System.in);

        //Getting year from user
        System.out.println("Please enter the year: ");
        year = input.nextInt();

        //Determining...
        if(year % 4 == 0)
        {
            if(year % 100 != 0)
            {
                System.out.println(year + " is leap year");
            }
            else if((year % 100 == 0) && (year % 400 == 0))
            {
                System.out.println(year + " is leap year");
            }
            else if((year % 100 == 0) && (year % 400 != 0))
            {
                System.out.println(year + " is not leap year.");
            }
        }
        else{
            System.out.println(year + " is not leap year.");
        }
    }
}
