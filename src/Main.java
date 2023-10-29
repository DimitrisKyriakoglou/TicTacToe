
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 9 cells: ");
        String cells = input.nextLine().toUpperCase();

        if (cells.length() == 9) {
            //Right Input check possible results


            // printResult(cells);
            checkInput(cells);


        } else if (cells.length() < 9) {
            //did not enter all
            Impossible(cells);
        } else {
            //enter more than 9
            Impossible(cells);
        }

    }

    public static void printResult(String cells) {
        //Result Print
        System.out.println("---------");
        System.out.println("| " + cells.charAt(0) + " " + cells.charAt(1) + " " + cells.charAt(2) + " |");
        System.out.println("| " + cells.charAt(3) + " " + cells.charAt(4) + " " + cells.charAt(5) + " |");
        System.out.println("| " + cells.charAt(6) + " " + cells.charAt(7) + " " + cells.charAt(8) + " |");
        System.out.println("---------");


    }

    public static void checkInput(String cells) {
        boolean flagX = false;
        boolean flagO = false;
        boolean flagEmpty = false;
        boolean flagNotFinished = false;


        //X wins
        if ((cells.charAt(0) == 'X') &&
                (cells.charAt(1) == 'X') &&
                (cells.charAt(2) == 'X')) {
            //xWins();
            flagX = true;
        }

        if ((cells.charAt(3) == 'X') &&
                (cells.charAt(4) == 'X') &&
                (cells.charAt(5) == 'X')) {
            // xWins();
            flagX = true;
        }

        if ((cells.charAt(6) == 'X') &&
                (cells.charAt(7) == 'X') &&
                (cells.charAt(8) == 'X')) {
            // xWins();
            flagX = true;
        }

        if ((cells.charAt(0) == 'X') &&
                (cells.charAt(3) == 'X') &&
                (cells.charAt(6) == 'X')) {
            // xWins();
            flagX = true;
        }

        if ((cells.charAt(1) == 'X') &&
                (cells.charAt(4) == 'X') &&
                (cells.charAt(7) == 'X')) {
            //xWins();
            flagX = true;
        }

        if ((cells.charAt(2) == 'X') &&
                (cells.charAt(5) == 'X') &&
                (cells.charAt(8) == 'X')) {
            //xWins();
            flagX = true;
        }
        if ((cells.charAt(0) == 'X') &&
                (cells.charAt(4) == 'X') &&
                (cells.charAt(8) == 'X')) {
            // xWins();
            flagX = true;
        }
        if ((cells.charAt(2) == 'X') &&
                (cells.charAt(4) == 'X') &&
                (cells.charAt(6) == 'X')) {
            //xWins();
            flagX = true;
        }
        //O wins
        if ((cells.charAt(0) == 'O') &&
                (cells.charAt(1) == 'O') &&
                (cells.charAt(2) == 'O')) {
            //oWins();
            flagO = true;
        }

        if ((cells.charAt(3) == 'O') &&
                (cells.charAt(4) == 'O') &&
                (cells.charAt(5) == 'O')) {
            // oWins();
            flagO = true;
        }

        if ((cells.charAt(6) == 'O') &&
                (cells.charAt(7) == 'O') &&
                (cells.charAt(8) == 'O')) {
            // oWins();
            flagO = true;
        }

        if ((cells.charAt(0) == 'O') &&
                (cells.charAt(3) == 'O') &&
                (cells.charAt(6) == 'O')) {
            //oWins();
            flagO = true;
        }

        if ((cells.charAt(1) == 'O') &&
                (cells.charAt(4) == 'O') &&
                (cells.charAt(7) == 'O')) {
            //oWins();
            flagO = true;
        }

        if ((cells.charAt(2) == 'O') &&
                (cells.charAt(5) == 'O') &&
                (cells.charAt(8) == 'O')) {
            //oWins();
            flagO = true;
        }
        if ((cells.charAt(0) == 'O') &&
                (cells.charAt(4) == 'O') &&
                (cells.charAt(8) == 'O')) {
            //oWins();
            flagO = true;
        }
        if ((cells.charAt(2) == 'O') &&
                (cells.charAt(4) == 'O') &&
                (cells.charAt(6) == 'O')) {
            //oWins();
            flagO = true;
        }

        //Not finished and not xWin or oWin
        if ((cells.charAt(8) == ' ' || cells.charAt(8) == '_') &&(!flagX && !flagO) ) {
            flagNotFinished = true;
        }


        for (int i = 0; i < 8; i++) {

            if ((cells.charAt(i) == ' ' || cells.charAt(i) == '_') &&(!flagX && !flagO) && !flagNotFinished) {
                flagEmpty = true;

            }

        }


        if ( flagEmpty) {
            Impossible(cells);
        } else if (flagX && flagO) {
            Impossible(cells);

        } else if (flagX && !flagO ) {

            xWins(cells);
        } else if (!flagX && flagO ) {

            oWins(cells);
        } else if (flagNotFinished) {
            printResult(cells);
            System.out.println("Game not finished");
        }else{
            printResult(cells);
            System.out.println("Draw");
        }
    }




    public static void xWins(String cells) {

        printResult(cells);
        System.out.println("X wins");
    }

    public static void oWins(String cells) {

        printResult(cells);
        System.out.println("O wins");
    }

    public static void Impossible(String cells) {


        printResult(cells);
        System.out.println("Impossible");


    }

}




