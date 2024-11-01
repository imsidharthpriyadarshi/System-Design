package LLD.Design.ChessGame;

public class Position {
    private int x =-1, y=-1;

    public Position(int x, int y) {

        if(x<=7 && x>=0) {
            this.x = x;
        }else{
            System.out.println("Sorry, Position is invalid");
            return;
        }
        if(y<=7 && y>=0){
            this.y = y;

        }else{
            System.out.println("Sorry, Position is invalid");

        }
    }
    public  boolean isValid(){
        return x!=-1 && y!=-1;
    }

    public int getX() {
        return x;
    }



    public int getY() {
        return y;
    }


}
