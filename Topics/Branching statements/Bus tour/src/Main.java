import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String dano = scanner.nextLine(); // read first line

        String danoArr[] = dano.split(" ");  // transform in int array
        int danoArrInt[] = new int[danoArr.length];
        for (int i = 0; i < danoArr.length; i++) {
            danoArrInt[i] = Integer.parseInt(danoArr[i]);
            //System.out.println(danoArrInt[i]);
        }

        String dano1 = scanner.nextLine();  // read second line

        String dano1Arr[] = dano1.split(" ");  // transform in int array
        int dano1ArrInt[] = new int[dano1Arr.length];
        for (int i = 0; i < dano1Arr.length; i++) {
            dano1ArrInt[i] = Integer.parseInt(dano1Arr[i]);
            //System.out.println(dano1ArrInt[i]);
        }
        boolean stopped = false;
        for (int i = 0; (i < dano1ArrInt.length) && !stopped; i++) {
            if (danoArrInt[0] >= dano1ArrInt[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                stopped = true;
                break;
            }
        }
        if (stopped == false) {
            System.out.println("Will not crash");
        }
    }
}