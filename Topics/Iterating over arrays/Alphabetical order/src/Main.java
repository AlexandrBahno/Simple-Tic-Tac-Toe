import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //String[] str1 = new String[];
        String[] str1 = scanner.nextLine().split(" ");
        //System.out.println(Arrays.toString(str1));
        boolean compare = true;
        for (int i = 0; (i < str1.length) && !compare; i++) {
            if (str1[i].compareTo(str1[i + 1]) > 0) {
                compare = false;
                break;
            }
        }
        if (str1[str1.length - 2].compareTo(str1[str1.length - 1]) > 0) {
            compare = false;
        }
        System.out.println(compare);
        //System.out.println(str1[str1.length - 2]);
        //System.out.println(str1[str1.length - 1]);
        //System.out.println(str1[3].compareTo(str1[4]) > 0);

    }
}