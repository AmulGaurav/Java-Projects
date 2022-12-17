package Rock_Paper_Scissors;

/*
Enter
0 --> Rock
1 --> Paper
2 --> Scissors
*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String [] args) {

        System.out.println("Enter-\n0 for Rock\n1 for Paper\n2 for Scissor");

        Scanner user = new Scanner(System.in);
        int player = user.nextInt(3);
        user.close();

        Random random = new Random();
        int computer = random.nextInt(3);

        String computer_move;

        if(computer==0) {
            computer_move = "Rock";
        }
        else if(computer==1) {
            computer_move = "Paper";
        }
        else {
            computer_move = "Scissor";
        }

        System.out.println();

        switch(player) {
            case 0:
            System.out.println("You      : Rock");
            System.out.println("      vs      ");
            System.out.println("Computer : " + computer_move);
            break;
            case 1:
            System.out.println("You      : Paper");
            System.out.println("      vs      ");
            System.out.println("Computer : " + computer_move);
            break;
            default:
            System.out.println("You      : Scissor");
            System.out.println("      vs      ");
            System.out.println("Computer : " + computer_move);
        }

        if( player == computer ) {
            System.out.println("\nMatch Draw");
        }
        else if( (player==0 && computer==2) || (player==1 && computer==0) || (player==2 && computer==1) ) {
            System.out.println("\nYou win");
        }
        else {
            System.out.println("\nComputer wins");
        }

    }
}
