import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int n = arr.length; // длина масссива
        steps = n < steps ? steps - (steps/n) * n : steps;
        int[] arr1 = new int[n];
        //System.out.println("sters = " + steps);
        for (int i = 0; i < n; i++) {
            if (i + steps < n) {
                arr1[i + steps] = arr[i];
            } else {
                arr1[i + steps - n] = arr[i];
            }
        }
        //System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }
        //System.out.println(Arrays.toString(arr));
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}