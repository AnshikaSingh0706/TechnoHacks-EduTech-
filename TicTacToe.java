import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        displayBoard(board);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int currentPlayer = random.nextInt(2); 
        char currentPlayerSymbol = (currentPlayer == 0) ? 'X' : 'O';

        boolean gameFinished = false;
        int moves = 0;

        while (!gameFinished) {
            if (currentPlayer == 0) {
                System.out.println("Your Turn........");
                System.out.println("Enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (isValidMove(board, row, col)) {
                    board[row][col] = 'X';
                    currentPlayerSymbol = 'X';
                    currentPlayer = 1;
                    moves++;
                } else {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }
            } else {
                System.out.println("Computer's Turn........");
                int[] computerMove = generateComputerMove(board);
                int row = computerMove[0];
                int col = computerMove[1];

                board[row][col] = 'O';
                currentPlayerSymbol = 'O';
                currentPlayer = 0;
                moves++;
            }

            displayBoard(board);

            if (checkWin(board, currentPlayerSymbol)) {
                System.out.println(currentPlayerSymbol + "You wins!!");
                gameFinished = true;
            } else if (moves == 9) {
                System.out.println("It's a draw!");
                gameFinished = true;
            }
            
        }

        scanner.close();
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true; 
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true; 
        }
        return false;
    }

    public static int[] generateComputerMove(char[][] board) {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!isValidMove(board, row, col));
        return new int[]{row, col};
    }
}
