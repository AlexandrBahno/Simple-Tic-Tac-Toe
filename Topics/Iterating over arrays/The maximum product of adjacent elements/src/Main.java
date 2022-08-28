import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int proiz = 0;
        for (int i = 0; i < n - 1; i++) {
            if (proiz < num[i] * num[i + 1]) {
                proiz = num[i] * num[i + 1];
            }
        }
        System.out.println(proiz);



    }
}