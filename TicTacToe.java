class Board {
    char[][] board;
    char currentPlayer;

    Board() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("--|---|--");
        }
        System.out.println();
    }

    void makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = currentPlayer;
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }

    void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}

class Game extends Board {

    boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

public class TicTacToe {
    public static void main(String[] args) {
        Game game = new Game();
        game.displayBoard();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("Player " + game.currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            game.makeMove(row - 1, col - 1);

            game.displayBoard();
            if (game.checkWinner()) {
                System.out.println("Player " + game.currentPlayer + " wins!");
                gameEnded = true;
            } else if (game.isBoardFull()) {
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                game.switchPlayer();
            }
        }

        scanner.close();
    }
}
