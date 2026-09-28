import java.util.Scanner;

public class inputInloops {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num = src.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Enter number:");
            int input = src.nextInt();

            if (input % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }

        src.close();
    }
}