import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] row = new int[n];
        for (int i = 0; i < n; i++) {
            row[i] = sc.nextInt();
        }
        int count = 1;
        int max = 1;

        for (int i = 0; i < n - 1; i++) {
            if (row[i] < row[i + 1]) {
                count += 1;
                //System.out.println("i = " + i +"; count = " + count);
                if (i == n - 2) {
                    max = count;
                }
            } else {
                max = count > max ? count : max;
                //System.out.println("max = " + max +"; count = " + count);
                count = 1;
            }
        }
        System.out.println(max);

    }
}