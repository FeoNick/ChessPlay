public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine >= 0 && toColumn >= 0) && (toLine <= 7 && toColumn <= 7)) {
            if ((line != toLine && column != toColumn) && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) &&
                    chessBoard.board[line][column] != null)
                return Math.abs(toLine - line) == Math.abs(toColumn - column);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
