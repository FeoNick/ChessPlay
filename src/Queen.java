public class Queen extends ChessPiece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine >= 0 && toColumn >= 0) && (toLine <= 7 && toColumn <= 7) && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) &&
                chessBoard.board[line][column] != null) {
            if ((line == toLine && column != toColumn) || (line != toLine && column == toColumn))
                return true;
            if (line != toLine && column != toColumn)
                return Math.abs(toLine - line) == Math.abs(toColumn - column);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
