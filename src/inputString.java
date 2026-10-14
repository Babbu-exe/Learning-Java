import java.util.Scanner;
public class inputString {
    public static void main(String[]args){
        Scanner src =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= src.nextLine();
        System.out.println("your name is "+  name);
    }
}
