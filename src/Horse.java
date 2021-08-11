public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine >= 0 && toColumn >= 0) && (toLine <= 7 && toColumn <= 7) && (chessBoard.board[toLine][toColumn] == null ||
                !chessBoard.board[toLine][toColumn].color.equals(this.color)) &&
                chessBoard.board[line][column] != null) {

            if ((toLine - line == 2 && toColumn - column == 1) || (toColumn - column == 2 && toLine - line == 1)) {
                return true;
            } else if ((toLine - line == 2 && toColumn - column == -1) || (toColumn - column == 2 && toLine - line == -1)) {
                return true;
            } else if ((toLine - line == -2 && toColumn - column == -1) || (toColumn - column == -2 && toLine - line == -1)) {
                return true;
            } else if ((toLine - line == -2 && toColumn - column == 1) || (toColumn - column == -2 && toLine - line == 1)) {
                return true;
            } else if ((toLine - line == 1 && toColumn - column == 2) || (toColumn - column == 1 && toLine - line == 2)) {
                return true;
            } else if ((toLine - line == 1 && toColumn - column == -2) || (toColumn - column == 1 && toLine - line == -2)) {
                return true;
            } else if ((toLine - line == -1 && toColumn - column == -2) || (toColumn - column == -1 && toLine - line == -2)) {
                return true;
            } else if ((toLine - line == -1 && toColumn - column == 2) || (toColumn - column == -1 && toLine - line == 2)) {
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
