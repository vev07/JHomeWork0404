package Game;

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Game {
    public static void main(String[] args) throws InterruptedException {

        // gameOneVsOnce();
        // gameOneVsComputer();
        gameComputerVsComputer();
    }
    public static void gameOneVsOnce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rules of the game Rock Paper Scissors. We have three variable which you should enter. You enter only one char " +
                "from variable. Rock - r; Paper - p; Scissors - s; Well - 'w");

        char exit = 'y';
        while (exit != 'q') {
            System.out.println("First player enter you char r, s, p, w");
            char firstPlayer = scanner.next().charAt(0);
            System.out.println("Second player enter you char r, s, p, w");
            char secondPlayer = scanner.next().charAt(0);
            if (firstPlayer == 'p' && secondPlayer == 'r') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'r' && secondPlayer == 's') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'p' && secondPlayer == 'w') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'w' && secondPlayer == 's') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'p') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'r' && secondPlayer == 'p') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'r') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 'w' && secondPlayer == 'p') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'w') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 'p' && secondPlayer == 's') {
                System.out.println("Second player won!!!");
            } else {
                System.out.println("It is draw!!!");
            }
            System.out.println("If you want to exit you should enter 'q', if you want to continue " +
                    "you should press any button");
            exit = scanner.next().charAt(0);

        }
    }
    public static void gameOneVsComputer() {
        Scanner scanner2 = new Scanner(System.in);
        Random randI = new Random();
        char secondPlayer = 0;
        System.out.println("Rules of the game Rock Paper Scissors. We have three variable which you should enter. You enter only one char " +
                "from variable. Rock - r; Paper - p; Scissors - s; Well - 'w");

        char exit = 'y';
        while (exit != 'q') {
            System.out.println("First player enter you char r, s, p, w");
            char firstPlayer = scanner2.next().charAt(0);

            int x = randI.nextInt(4);
            switch (x) {
                case 0 :
                    secondPlayer = 'r';
                    break;
                case 1 :
                    secondPlayer = 's';
                    break;
                case 2 :
                    secondPlayer = 'p';
                    break;
                case 3 :
                    secondPlayer = 'w';
                    break;
            }
            System.out.println("second player enter " + secondPlayer);


            if (firstPlayer == 'p' && secondPlayer == 'r') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'r' && secondPlayer == 's') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'p' && secondPlayer == 'w') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'w' && secondPlayer == 's') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'p') {
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'r' && secondPlayer == 'p') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'r') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 'w' && secondPlayer == 'p') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'w') {
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 'p' && secondPlayer == 's') {
                System.out.println("Second player won!!!");
            } else {
                System.out.println("It is draw!!!");
            }
            System.out.println("If you want to exit you should enter 'q', if you want to continue " +
                    "you should press any button");
            exit = scanner2.next().charAt(0);

        }
    }
    public static void gameComputerVsComputer() throws InterruptedException {
        Scanner scanner2 = new Scanner(System.in);
        Random randI = new Random();
        char firstPlayer = 0;
        char secondPlayer = 0;

        System.out.println("Rules of the game Rock Paper Scissors. We have three variable which you should enter. You enter only one char " +
                "from variable. Rock - r; Paper - p; Scissors - s; Well - 'w");

        char exit = 'y';
        while (exit != 'q') {
            System.out.println("First player enter you char r, s, p, w");
            int y = randI.nextInt(4);

            switch (y) {
                case 0 :
                    firstPlayer = 'r';
                    break;
                case 1 :
                    firstPlayer = 's';
                    break;
                case 2 :
                    firstPlayer = 'p';
                    break;
                case 3 :
                    firstPlayer = 'w';
                    break;
            }
            System.out.println("first Player enter " + firstPlayer);
            Thread.sleep(1000);


            int x = randI.nextInt(4);
            switch (x) {
                case 0 :
                    secondPlayer = 'r';
                    break;
                case 1 :
                    secondPlayer = 's';
                    break;
                case 2 :
                    secondPlayer = 'p';
                    break;
                case 3 :
                    secondPlayer = 'w';
                    break;
            }
            System.out.println("second player enter " + secondPlayer);
            Thread.sleep(1000);


            if (firstPlayer == 'p' && secondPlayer == 'r') {
                Thread.sleep(1000);
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'r' && secondPlayer == 's') {
                Thread.sleep(1000);
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'p' && secondPlayer == 'w') {
                Thread.sleep(1000);
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'w' && secondPlayer == 's') {
                Thread.sleep(1000);
                System.out.println("First player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'p') {
                Thread.sleep(1000);
                System.out.println("First player won!!!");
            } else if (firstPlayer == 'r' && secondPlayer == 'p') {
                Thread.sleep(1000);
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'r') {
                Thread.sleep(1000);
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 'w' && secondPlayer == 'p') {
                Thread.sleep(1000);
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 's' && secondPlayer == 'w') {
                Thread.sleep(1000);
                System.out.println("Second player won!!!");
            } else if (firstPlayer == 'p' && secondPlayer == 's') {
                Thread.sleep(1000);
                System.out.println("Second player won!!!");
            } else {
                Thread.sleep(1000);
                System.out.println("It is draw!!!");
            }
            Thread.sleep(1000);
            System.out.println("If you want to exit you should enter 'q', if you want to continue " +
                    "you should press any button");
            exit = scanner2.next().charAt(0);

        }
    }
}
