import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }
        //int number = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            count = count + data[i];
        }
        System.out.println(count);
    }
}