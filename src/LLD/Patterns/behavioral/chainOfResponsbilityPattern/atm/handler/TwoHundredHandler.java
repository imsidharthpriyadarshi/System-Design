package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.handler;

import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.NotesHandlers;

public class TwoHundredHandler extends NotesHandlers {
    public TwoHundredHandler(NotesHandlers notesHandlers) {
        super(notesHandlers);
    }
    @Override
    public void getNotes( int rest_amount) {

        if(rest_amount>=200){
            int notes= rest_amount/200;
            int rest=rest_amount%200;
            System.out.println("200:- " +notes+" notes");
            if (rest!=0){
                super.getNotes(rest);
            }


        }else {
            super.getNotes(rest_amount);
        }
    }
}
