import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] masiv = new int[n];
        for (int i = 0; i < n; i++) {
            masiv[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(masiv));
        int row = 0;

        for (int j = 0; j < n - 2; j++) {
            //System.out.println(masiv[j] +" "+(-1 + masiv[j +1]) +" "+(-2 + masiv[j +2]) );
            if (masiv[j] == (-1 + masiv[j +1]) && masiv[j] == (-2 + masiv[j +2])) {
                row += 1;
                //System.out.println("j = " + j +"  masiv[j] = "+masiv[j] + "  row = " + row);
            }
        }
        System.out.println(row);
    }
}