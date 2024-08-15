import java.util.Scanner;
public class numberGame {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num = 1 + (int)(100 * Math.random());

            int t = 5;
            int i;

            System.out.println("A number is chosen between 1 to 100 Guess the number within 5 trials.");


            for ( i = 0; i < t; i++) {

                System.out.println("Guess the number:");

                int guess = sc.nextInt();

                if (num == guess) {
                    System.out.println("Congratulations You guessed the number.");
                    break;
                }
                else if (num > guess && i != t - 1) {
                    System.out.println("The number is greater than " + guess);
                }
                else if (num < guess && i != t - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == t) {
                System.out.println("You have exhausted your number of trials.");

                System.out.println("The number was " + num);
            }
        }

    }


