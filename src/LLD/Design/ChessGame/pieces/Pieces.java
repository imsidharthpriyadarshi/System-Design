package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.Move;

public class Pieces {
    private boolean isKilled;
    private String name;
    private Move move;
    private boolean isWhite;

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public Pieces(boolean isKilled, boolean isWhite, String name, Move move) {
        this.isKilled = isKilled;
        this.name = name;
        this.move = move;
        this.isWhite=isWhite;
    }
}
