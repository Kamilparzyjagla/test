import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon) {
            printBoard();
            playerMove(scanner);
            gameWon = checkWin();
            if (gameWon) {
                printBoard();
                System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
            } else {
                switchPlayer();
            }
        }
    }

    private static void printBoard() {
        System.out.println("--------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
            System.out.println("--------------");
        }
    }

    private static void playerMove(Scanner scanner) {
        int row, col;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Spieler " + currentPlayer + ", gib die Zeile (0-2) und Spalte (0-2) ein: ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                validMove = true;
            } else {
                System.out.println("Ungültiger Zug, versuche es erneut.");
            }
        }
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean checkWin() {
        // Überprüfen der Reihen
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Überprüfen der Spalten
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Überprüfen der Diagonalen
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }
}
