import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = user.nextInt();
        user.close();
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                }
                else {
                    System.out.println(year + " is not a leap year");
                }
            }
            else {
                System.out.println(year + " is a leap year.");
            }
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
