package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.handler;

import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.NotesHandlers;

public class FiveHundredHandler extends NotesHandlers {
    public FiveHundredHandler(NotesHandlers notesHandlers) {
        super(notesHandlers);
    }

    @Override
    public void getNotes( int rest_amount) {
        if (rest_amount<=0){
            System.out.println("Make sure you'll pass a valid amount");
            return;
        }
        if(rest_amount>=500){
            int notes= rest_amount/500;
            int rest=rest_amount%500;
            System.out.println("500:- " +notes+" notes");
            if (rest!=0){
                super.getNotes(rest);
           }


        }else {
            super.getNotes(rest_amount);
        }
    }
}
