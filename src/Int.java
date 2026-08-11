public class Int {
    public static void main(String[]args){
        int a=20;
        int b=5;
        int Sum=a+b;
        System.out.println("the Sum of a and b is:" + Sum);
        //product
        int prd=a*b;
        System.out.println("The product of " +a+ " and "  +b+  " is: "  +prd);
        //division
        int v1= a/b;
        int v2= b/a;
        int v3= a % b;
        System.out.println("a/b=" + v1);
        System.out.println("b/a="+ v2);
        System.out.println("a%b="+ v3);
    }
}