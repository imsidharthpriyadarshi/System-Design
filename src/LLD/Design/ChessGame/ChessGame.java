package LLD.Design.ChessGame;

import LLD.Design.ChessGame.pieces.*;

public class ChessGame {
    private Block[][] game_blocks;
    private Player p1;
    private Player p2;
    private Status status=Status.ACTIVE;
    private boolean isWhiteChance=true;

    public ChessGame(String p1_name, String p2_name, boolean is_p1_white){
        this.game_blocks=new Block[8][8];
        this.p1= new Player(p1_name, is_p1_white);
        this.p2= new Player(p2_name, !is_p1_white);
        init(is_p1_white);
    }
    private void init(boolean is_p1_white){
        //white pieces initialization
        game_blocks[0][0]=new Block(new Position(0,0),new Hathi(is_p1_white),false);
        game_blocks[1][0]=new Block(new Position(1,0),new Bazir(is_p1_white),false);
        game_blocks[2][0]=new Block(new Position(2,0),new Godha(is_p1_white),false);
        game_blocks[3][0]=new Block(new Position(3,0),new Queen(is_p1_white),false);
        game_blocks[4][0]=new Block(new Position(4,0),new Mantri(is_p1_white),false);
        game_blocks[5][0]=new Block(new Position(5,0),new Godha(is_p1_white),false);
        game_blocks[6][0]=new Block(new Position(6,0),new Bazir(is_p1_white),false);
        game_blocks[7][0]=new Block(new Position(7,0),new Hathi(is_p1_white),false);

        for (int i=0;i<8;i++){
            game_blocks[i][1]=new Block(new Position(i,1),new Pawn(is_p1_white),false);
        }


        //black pieces initialization

        game_blocks[0][7]=new Block(new Position(0,7),new Hathi(!is_p1_white),false);
        game_blocks[1][7]=new Block(new Position(1,7),new Bazir(!is_p1_white),false);
        game_blocks[2][7]=new Block(new Position(2,7),new Godha(!is_p1_white),false);
        game_blocks[3][7]=new Block(new Position(3,7),new Queen(!is_p1_white),false);
        game_blocks[4][7]=new Block(new Position(4,7),new Mantri(!is_p1_white),false);
        game_blocks[5][7]=new Block(new Position(5,7),new Godha(!is_p1_white),false);
        game_blocks[6][7]=new Block(new Position(6,7),new Bazir(!is_p1_white),false);
        game_blocks[7][7]=new Block(new Position(7,7),new Hathi(!is_p1_white),false);
        for (int i=0;i<8;i++){
            game_blocks[i][6]=new Block(new Position(i,6),new Pawn(!is_p1_white),false);
        }
        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                game_blocks[j][i]=new Block(new Position(j,i),null, true);
            }
        }
    }

    private void makeMove(Position start, boolean isWhite, Position end){
        if (status==Status.ACTIVE){
            if (start.isValid() && end.isValid()) {
                int x=start.getX(),y=start.getY();
                int x_end= end.getX(),y_end=end.getY();
                Block curr = game_blocks[x][y];
                Block curr_end=game_blocks[x_end][y_end];
                if (curr != null) {
                    if (isWhite) {
                        if(curr.getPieces().isWhite()){
                            if (curr_end.getPieces()==null) {
                                if(curr.getPieces().getMove().move(start, end)) {
                                    curr_end.setPieces(curr.getPieces());
                                    curr_end.setEmpty(false);
                                    curr_end.setPosition(end);
                                    game_blocks[x][y]=new Block(new Position(x,y),null, true);
                                    isWhiteChance = !isWhiteChance;
                                }

                            }else{
                                if (curr_end.getPieces().isWhite()){
                                    System.out.println("You can not play this move, because your piece is present at destination");
                                }else{
                                    if(curr.getPieces() instanceof Queen && !curr_end.getPieces().isWhite()){
                                        status=Status.WHITE_WIN;
                                    }
                                    if (curr.getPieces().getMove().move(start, end)) {
                                        curr_end.getPieces().setKilled(true);
                                        curr_end.setPieces(curr.getPieces());
                                        curr_end.setEmpty(false);
                                        curr_end.setPosition(end);
                                        game_blocks[x][y]=new Block(new Position(x,y),null, true);

                                        isWhiteChance = !isWhiteChance;
                                    }
                                }
                            }
                        }else {
                            System.out.println("This is not your Piece");
                        }

                    }else{
                        //in same way I have to do here for black pieces
                        if(!curr.getPieces().isWhite()){
                            if (curr_end.getPieces()==null) {
                                if(curr.getPieces().getMove().move(start, end)) {
                                    curr_end.setPieces(curr.getPieces());
                                    curr_end.setPosition(end);
                                    game_blocks[x][y]=new Block(new Position(x,y),null, true);

                                    isWhiteChance = !isWhiteChance;
                                }

                            }else{
                                if (!curr_end.getPieces().isWhite()){
                                    System.out.println("You can not play this move, because your piece is present at destination");
                                }else{
                                    if(curr.getPieces() instanceof Queen && curr_end.getPieces().isWhite()){
                                        status=Status.BLACK_WIN;
                                    }
                                    if (curr.getPieces().getMove().move(start, end)) {
                                        curr_end.getPieces().setKilled(true);
                                        curr_end.setPieces(curr.getPieces());
                                        curr_end.setPosition(end);
                                        game_blocks[x][y]=new Block(new Position(x,y),null, true);
                                        isWhiteChance = !isWhiteChance;
                                    }
                                }
                            }
                        }else {
                            System.out.println("This is not your Piece");
                        }

                    }
                } else {
                    System.out.println("No Piece was found");
                }
            }else {
                System.out.println("Move is not valid");
            }

        }else{
            System.out.println("This game is over ");
        }
    }


    public static void main(String[] arg){
        ChessGame chessGame= new ChessGame("Aditya","Sidharth",true);
        chessGame.makeMove(new Position(0,1), chessGame.isWhiteChance, new Position(0,2));
        chessGame.makeMove(new Position(3,7), chessGame.isWhiteChance, new Position(3,6));

    }

}
