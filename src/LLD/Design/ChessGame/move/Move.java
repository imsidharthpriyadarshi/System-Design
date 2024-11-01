package LLD.Design.ChessGame.move;

import LLD.Design.ChessGame.Position;

public interface Move {
    boolean move(Position start, Position end);
}
