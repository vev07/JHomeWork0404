import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        chatBot();


//        Random randI = new Random();
//       char secondPlayer = 0;
//        int x = randI.nextInt(4);
//        switch (x) {
//            case 0 :
//                secondPlayer = 'r';
//                break;
//            case 1 :
//                secondPlayer = 's';
//                break;
//            case 2 :
//                secondPlayer = 'p';
//                break;
//            case 3 :
//                secondPlayer = 'w';
//                break;
//        }
//        System.out.println(secondPlayer);
//    }
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
    public static void chatBot() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter words: Hello, How are you?");
            String str = scanner.nextLine();
            switch (str) {
                case "Hello" :
                    System.out.println("Hello you!");
                    break;
                case "How are you?" :
                    System.out.println("I am well");
                    break;
            }

        }
    }
}
