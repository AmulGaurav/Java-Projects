import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = user.nextInt();
        user.close();
        if(year % 4 == 0) {
            System.out.printf("%d is a Leap year", year);
        }
        else {
            System.out.printf("%d is not a Leap year", year);
        }
    }
}
