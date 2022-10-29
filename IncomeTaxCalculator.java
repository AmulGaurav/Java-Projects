import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        float income = sc.nextFloat();
        sc.close();
        float tax = 0.0f;

        if(income <= 2.5) {
            tax = 0;
        }
        else if(income > 2.5 && income <= 5.0) {
            tax += (income - 2) * 0.05;
        }
        else if(income > 5.0 && income <= 10.0) {
            tax += 2.5 * 0.05;
            tax += (income - 5) * 0.1;
        }
        else {
            tax += 2.5 * 0.05;
            tax += 5 * 0.1;
            tax += (income - 10) * 0.2;
        }
        System.out.printf("The tax you have to pay as per Income Tax India is : %f", tax);
    }
}
