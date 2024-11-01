package LLD.Design.ChessGame;

import LLD.Design.ChessGame.pieces.Pieces;

public class Block {
    private Position position;
    private Pieces pieces;
    private boolean isEmpty;

    public Block(Position position, Pieces pieces, boolean isEmpty) {
        this.position = position;
        this.pieces = pieces;
        this.isEmpty = isEmpty;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
