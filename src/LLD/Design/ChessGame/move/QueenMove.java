package LLD.Design.ChessGame.move;

import LLD.Design.ChessGame.Position;

public class QueenMove implements Move {
    @Override
    public boolean move(Position start, Position end) {
        if((Math.abs(start.getX()-end.getX()) + Math.abs(start.getY()-end.getY())) ==1){
            System.out.println("Moved");
            return true;
        }else{
            System.out.println("This move is not possible by Queen");
        }
        return false;
    }
}
