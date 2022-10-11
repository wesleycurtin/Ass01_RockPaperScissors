import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String player1 = "";
        String player2 = "";
        String play = "";
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        boolean playAgain = false;

        do {

            do {
                System.out.print("Enter Player 1's move [R,P,S]: ");

                if (in.hasNextLine()) {
                    player1 = in.nextLine();
                    if (player1.equals("R")) {
                        done1 = true;
                    } else if (player1.equals("P")) {
                        done1 = true;
                    } else if (player1.equals("S")) {
                        done1 = true;
                    } else {
                        System.out.println("Not a valid input!");
                    }
                }
            } while (!done1);

            do {
                System.out.print("Enter Player 2's move [R,P,S]: ");

                if (in.hasNextLine()) {
                    player2 = in.nextLine();
                    if (player2.equals("R")) {
                        done2 = true;
                    } else if (player2.equals("P")) {
                        done2 = true;
                    } else if (player2.equals("S")) {
                        done2 = true;
                    } else {
                        System.out.println("Not a valid input!");
                    }
                }
            } while (!done2);

            if (player1.equals("R") && player2.equals("R")) {
                System.out.println("You both chose Rock! It's a tie!");
            } else if (player1.equals("R") && player2.equals("P")) {
                System.out.println("Player 1 chose Rock and Player 2 chose Paper! Paper covers Rock! Player 2 Wins!");
            } else if (player1.equals("R") && player2.equals("S")) {
                System.out.println("Player 1 chose Rock and Player 2 chose Scissors! Rock breaks Scissors! Player 1 Wins!");
            } else if (player1.equals("P") && player2.equals("R")) {
                System.out.println("Player 1 chose Paper and Player 2 chose Rock! Paper covers Rock! Player 1 Wins!");
            } else if (player1.equals("P") && player2.equals("P")) {
                System.out.println("You both chose Paper! It's a tie!");
            } else if (player1.equals("P") && player2.equals("S")) {
                System.out.println("Player 1 chose Paper and Player 2 chose Scissors! Scissors cuts Paper! Player 2 Wins!");
            } else if (player1.equals("S") && player2.equals("R")) {
                System.out.println("Player 1 chose Scissors and Player 2 chose Rock! Rock breaks Scissors! Player 2 Wins!");
            } else if (player1.equals("S") && player2.equals("S")) {
                System.out.println("You both chose Scissors! It's a tie!");
            } else {
                System.out.println("Player 1 chose Scissors and Player 2 chose Paper! Scissors cuts Paper! Player 1 Wins!");
            }
            do {
                System.out.print("\nDo you want to play again [Y/N]: ");
                if (in.hasNextLine()) {
                    play = in.nextLine();
                    if (play.equals("Y")) {
                        done3 = true;
                    } else if (play.equals("N")) {
                        playAgain = true;
                        done3 = true;
                    } else {
                        System.out.println("Not a valid input!");
                    }
                }

            } while (!done3);

        }while (!playAgain);


    }
}