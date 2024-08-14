package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm;

public abstract class NotesHandlers {


    private NotesHandlers nextNotesHandler;
    public NotesHandlers(NotesHandlers notesHandlers){
        this.nextNotesHandler=notesHandlers;
    }

    public void getNotes(int rest_amount){
        if(rest_amount==0)return;
        if(this.nextNotesHandler!=null){
            nextNotesHandler.getNotes(rest_amount);
        }else{
            if (rest_amount!=0){
                System.out.println("Plz enter a multiple of 100, 200, 500");
            }
        }
    }

}
