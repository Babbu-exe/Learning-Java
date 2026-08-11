public class gradingSystem {
    public static void main(String[]args){
        int score;
        score =96;
        if (score >= 90) {
            System.out.println("Excellent");
        }
        else if (score>=80){
            System.out.println("Good");
        }
        else if (score>=70){
            System.out.println("Fair");
        }
        else if (score>=60){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("below Expectations");
        }
    }
}
