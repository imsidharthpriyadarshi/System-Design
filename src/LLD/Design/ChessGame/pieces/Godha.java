package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.GodhaMove;
import LLD.Design.ChessGame.move.Move;

public class Godha extends Pieces{
    public Godha(boolean isWhite) {
        super(false, isWhite, "Ghoda", new GodhaMove());
    }
}
