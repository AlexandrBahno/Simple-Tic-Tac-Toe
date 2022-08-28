import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] paint = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < paint[i].length; j++) {
                if (i != n / 2 && j != n / 2) {
                    paint[i][j] = ".";
                } else {
                    paint[i][j] = "*";
                }
                if (i == j) {
                    paint[i][j] = "*";
                } else if (j == n - i - 1) {
                    paint[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < paint[i].length; j++) {
                System.out.print(paint[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.toSring());
    }
}