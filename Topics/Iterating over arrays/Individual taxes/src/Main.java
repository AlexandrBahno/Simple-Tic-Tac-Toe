import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt(); // колич компаний
        float[] oborot = new float[n];
        float[] tax = new float[n];
        float max = 0;
        int numCompani = 0;
        for (int i = 0; i < n; i++) {
            oborot[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tax[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(oborot));
        //System.out.println(Arrays.toString(tax));

        for (int i = 0; i < n; i++) {
            if (max < oborot[i] * tax[i] / 100) {
                max = oborot[i] * tax[i] / 100;
                numCompani = i;
                //System.out.println((oborot[i] * tax[i] / 100) + " " + numCompani);
            }
        }
        System.out.println(numCompani + 1);
    }
}