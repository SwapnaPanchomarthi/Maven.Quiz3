package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    public TicTacToe(String[][] board) {
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
       String[] board = new String[3];
       for( int i=0;i<3;i++) {
           if (board[i] == "O")

               board[i] = "X";

           else
               board[i] = "X";
       }
            return board;
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
