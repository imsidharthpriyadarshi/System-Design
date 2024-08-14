package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.handler;

import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.NotesHandlers;

public class OneHundredHandler extends NotesHandlers {
    public OneHundredHandler(NotesHandlers notesHandlers) {
        super(notesHandlers);
    }

    @Override
    public void getNotes( int rest_amount) {

        if(rest_amount>=100){
            int notes= rest_amount/100;
            int rest=rest_amount%100;
            if (rest!=0){
                System.out.println("100:- " +notes+" notes");
                super.getNotes(rest);
            }else{
                System.out.println("100:- " +notes+" notes");
            }


        }else {
            super.getNotes(rest_amount);
        }
    }
}
