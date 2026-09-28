import java.util.Scanner;
public class primeNum {
    public static void main (String[]args){
        Scanner src =new Scanner (System.in);
        System.out.println("enter a number = ");
        int num = src.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number");

    }
}
