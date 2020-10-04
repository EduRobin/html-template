import java.util.Scanner;

public class TicTacToe {
    public static int row,col;
    public static Scanner sc = new Scanner(System.in);
    public static char[][] playingBoard = new char [3][3];
    public static char turn = 'X';

    public static void main(String args[]) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                playingBoard[i][j] = '_';
            }
        }
        Play();
       
    }

    public static void Play() {
        boolean playing = true;
        PrintBoard();
        while(playing) {
            System.out.println(" Please enter the row and column: ");
            row = sc.nextInt() - 1;
            col = sc.nextInt() - 1;
            playingBoard[row][col] = turn;

            if(GameOver(row,col)) {
                playing = false;
                System.out.println("Game over! Player " + turn + " wins!");
            }

            PrintBoard();
            if(turn == 'X')
            turn = 'O';
            else 
            turn = 'X';
            
            

        }
    }

    public static void PrintBoard() {
        for(int i = 0; i < 3; i++) {
            System.out.println();
            for(int j = 0; j < 3; j++) {
                System.out.print(playingBoard[i][j] + "  ");
            }
        }
        System.out.println();
    }

    //porovnává zda-li vyhrál
    public static boolean GameOver(int colMove, int rowMove) { 
        //kolmý
        if(playingBoard[0][colMove] == playingBoard[1][colMove] && playingBoard[0][colMove] == playingBoard[2][colMove])
        return true;

        if(playingBoard[rowMove][0] == playingBoard[rowMove][1] && playingBoard[rowMove][0] == playingBoard[rowMove][2])
        return true;
        // šikmo
        if(playingBoard[0][0] == playingBoard[1][1] && playingBoard[0][0] == playingBoard[2][2] && playingBoard[1][1] != '_')
        return true;

        if(playingBoard[0][2] == playingBoard[1][1] && playingBoard[0][2] == playingBoard[2][0] && playingBoard[1][1] != '_')
        return true;

        return false;
    }
}
