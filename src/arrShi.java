public class arrShi {
    public static void main (String[]args){
        int[]one= new int[3];
        one[0]=1;
        one[1]=2;
        one[2]=3;
        int []two = one;
        two[1]=5;
        for(int i =0;i<two.length;i++){
            System.out.println(two[i]);
        }
    }
}
