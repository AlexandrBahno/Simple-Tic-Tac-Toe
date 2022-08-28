package tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // write your code here

    Scanner strings = new Scanner(System.in);
    String dano = strings.nextLine();
    char[] danoArray = dano.toCharArray();
    System.out.println("---------");

    for (int i = 1; i <= danoArray.length; i++) {
      if ( i == 1 || i == 4 || i == 7) {
        System.out.print("| ");
      }
      if ( i % 3 != 0) {
        System.out.print(danoArray[i-1] + " ");
      } else {
        System.out.print(danoArray[i-1] + " |");
        System.out.println();
      }
    }
    System.out.println("---------");
  }
}
