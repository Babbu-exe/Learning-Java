import java.util.Scanner;

public class inputGrading {
    public static void main(String[]args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score =src.nextInt();

        if (score >=90){
            System.out.println("A+");
        }else{
            if (score >=80){
                System.out.println("A");
            }else{
                if (score >=70){
                    System.out.println("B");
                }else{
                    if (score >=60){
                        System.out.println("c");
                    }else{
                        if (score >=50)
                        System.out.println("D");
                        else{
                            System.out.println("F");
                        }
                    }
                }
            }
        }

    }
}
