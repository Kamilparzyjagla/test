import java.util.Scanner;

public class VierGewinnt {

    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static char[][] board = new char[ROWS][COLS];
    private static char currentPlayer = 'X'; // Spieler X beginnt

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();

        while (true) {
            printBoard();
            System.out.println("Spieler " + currentPlayer + ", gib die Spalte (0-6) ein:");
            int column = scanner.nextInt();

            if (column < 0 || column >= COLS) {
                System.out.println("Ungültige Spalte! Versuche es erneut.");
                continue;
            }

            if (!dropDisc(column)) {
                System.out.println("Diese Spalte ist voll! Versuche eine andere.");
                continue;
            }

            if (checkWin()) {
                printBoard();
                System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("Das Spiel endet Unentschieden!");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }

    // Initialisiert das Spielfeld
    private static void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = ' '; // Leeres Feld
            }
        }
    }

    // Zeigt das Spielfeld an
    private static void printBoard() {
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
    }

    // Setzt den Stein des aktuellen Spielers in die angegebene Spalte
    private static boolean dropDisc(int column) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == ' ') {
                board[i][column] = currentPlayer;
                return true;
            }
        }
        return false; // Spalte voll
    }

    // Überprüft, ob der aktuelle Spieler gewonnen hat
    private static boolean checkWin() {
        // Überprüft jede Zelle im Spielfeld
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == currentPlayer) {
                    // Überprüft nach rechts
                    if (col + 3 < COLS && board[row][col] == currentPlayer &&
                            board[row][col + 1] == currentPlayer &&
                            board[row][col + 2] == currentPlayer &&
                            board[row][col + 3] == currentPlayer) {
                        return true;
                    }
                    // Überprüft nach unten
                    if (row + 3 < ROWS && board[row][col] == currentPlayer &&
                            board[row + 1][col] == currentPlayer &&
                            board[row + 2][col] == currentPlayer &&
                            board[row + 3][col] == currentPlayer) {
                        return true;
                    }
                    // Überprüft Diagonale nach unten rechts
                    if (row + 3 < ROWS && col + 3 < COLS && board[row][col] == currentPlayer &&
                            board[row + 1][col + 1] == currentPlayer &&
                            board[row + 2][col + 2] == currentPlayer &&
                            board[row + 3][col + 3] == currentPlayer) {
                        return true;
                    }
                    // Überprüft Diagonale nach unten links
                    if (row + 3 < ROWS && col - 3 >= 0 && board[row][col] == currentPlayer &&
                            board[row + 1][col - 1] == currentPlayer &&
                            board[row + 2][col - 2] == currentPlayer &&
                            board[row + 3][col - 3] == currentPlayer) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Überprüft, ob das Spielfeld voll ist
    private static boolean isBoardFull() {
        for (int i = 0; i < COLS; i++) {
            if (board[0][i] == ' ') {
                return false;
            }
        }
        return true;
    }

    // Wechselt den Spieler
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}