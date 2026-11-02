import java.util.Scanner;

public class RockPaperScissors {
    static void main(String[] args) {
        int randomNum = (int)(Math.random() * 3) + 1;
        int rock = 1;
        int paper = 2;
        int scissors = 3;

        System.out.println("Rock paper scissors");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please pick option 1, 2 or 3,");
        int a = scanner.nextInt();
        System.out.println("You picked" + a);

        System.out.println("The computer picked" + randomNum);

        if (a == randomNum) {
            System.out.println("draw");
        }
        else if ((a == rock && randomNum == scissors) ||
                (a == paper && randomNum == rock ||
                        (a == scissors && randomNum == paper ))) {
            System.out.println("you win");
        }
        else {
            System.out.println("you lose");
        }
        scanner.close();
    }

}
