package LLD.Design.ChessGame.move;

import LLD.Design.ChessGame.Position;

public class PawnMove implements Move{
    @Override
    public boolean move(Position start, Position end) {
        if((start.getX()==end.getX() && start.getY()+1==end.getY()) || (start.getX()+1==end.getX() && start.getY()+1==end.getY()) || (start.getX()-1==end.getX() && start.getY()+1==end.getY())){
            System.out.println("Moved");
            return true;
        }else{
            System.out.println("This move is not possible by Pawn");
        }
        return false;

    }
}
