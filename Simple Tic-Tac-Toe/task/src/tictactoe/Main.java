package tictactoe;

import java.util.Scanner;

public class Main {

    // создаем пустой массив
    static char[][] game = new char[3][3];
    static int stroka;
    static int stolbec;
    static int stepGame = 0;
    static int winsX = 0;
    static int winsO = 0;
    static Scanner coordinates = new Scanner(System.in);

    public static void main(String[] args) {
        // Заполнение массива чарами пробел
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = ' ';
            }
        }
        createField(); // печать игрового поля, обращение к ф-и печати
        // заполнение игрового массива, запрашиваем координаты
        // 0, 2, 4 - парный шаг - ход Х
        // 1, 3, 5 - непарный шаг - ход 0
        // делаем цикл на 9 шагов
        boolean stoper = false;
        for (int i = 0; i < 9 && !stoper; i++) {
            coordinateCheckRequest();   // ф-я проверки введенных координат на соответствие условий
            stepGame = i;
            playingFieldCheck(stepGame);  // проверка занята клетка поля game[stroka][stolbec] Х или 0, обращение к ф-и проверки
            createField();   // печать игрового поля, обращение к ф-и печати
            winningCombinationCheck();  // обращение к ф-и анализа игрового поля
            if (winsO > 0) {
                coordinates.close();
                System.out.print("O wins");
                stoper = true;
                System.exit(0);
            } else if (winsX > 0) {
                coordinates.close();
                System.out.print("X wins");
                stoper = true;
                System.exit(0);
            }
        }
        coordinates.close();
        System.out.print("Draw");
        System.exit(0);
    }

    private static void coordinateCheckRequest() {
        while (!coordinates.hasNextInt()) {  // Проверяем чтобы введенное значение было числом
            System.out.println("You should enter numbers!");
            coordinates.nextLine();
        }
        stroka = coordinates.nextInt();
        stolbec = coordinates.nextInt();

        if (stroka > 3 || stolbec > 3) {  // Проверка введенных координат на выход за рамки поля
            while (stroka > 3 || stolbec > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                stroka = coordinates.nextInt();
                stolbec = coordinates.nextInt();
            }
        }

    }

    private static void winningCombinationCheck() {
        int j = 0;
        for (int i = 0; i < 3; i++) {
            if (game[i][j] + game[i][j + 1] + game[i][j + 2] == 264) { // равенство по строке X
                winsX += 1;
            } else if (game[i][j] + game[i][j + 1] + game[i][j + 2] == 237) { // равенство по строке 0
                winsO += 1;
            } else if (game[j][i] + game[j + 1][i] + game[j + 2][i] == 264) { // равенство по столбцу Х
                winsX += 1;
            } else if (game[j][i] + game[j + 1][i] + game[j + 2][i] == 237) { // равенство по столбцу 0
                winsO += 1;
            } else if (game[j][j] + game[j + 1][j + 1] + game[j + 2][j + 2] == 264 ||
                    game[j][j + 2] + game[j + 1][j + 1] + game[j + 2][j] == 264) { // равенство по диагоналям X
                winsX += 1;
            } else if (game[j][j] + game[j + 1][j + 1] + game[j + 2][j + 2] == 237 ||
                    game[j][j + 2] + game[j + 1][j + 1] + game[j + 2][j] == 237) { // равенство по диагоналям 0
                winsO += 1;
            }
        }
    }

    public static void createField() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    // Ф-я проверки игрового поля - занята координата массива символом или нет

    private static void playingFieldCheck(int stepGame) {
        if (game[stroka - 1][stolbec - 1] == ' ') {
            if (stepGame % 2 == 0) {
                game[stroka - 1][stolbec - 1] = 'X';
            } else {
                game[stroka - 1][stolbec - 1] = 'O';
            }

        } else if (game[stroka - 1][stolbec - 1] == 'X' || game[stroka - 1][stolbec - 1] == 'O') {
            while (game[stroka - 1][stolbec - 1] == 'X' || game[stroka - 1][stolbec - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                coordinateCheckRequest();
            }
            if (stepGame % 2 == 0) {
                game[stroka - 1][stolbec - 1] = 'X';
            } else {
                game[stroka - 1][stolbec - 1] = 'O';
            }

        }
    }
}