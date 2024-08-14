package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm;

import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.handler.FiveHundredHandler;
import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.handler.OneHundredHandler;
import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.handler.TwoHundredHandler;

public class Main {
    public static void main(String[] args) {
        //? Chain of Responsibility pattern
        NotesHandlers notesHandlers= new FiveHundredHandler(new TwoHundredHandler(new OneHundredHandler(null)));
        notesHandlers.getNotes(2901);
        notesHandlers.getNotes(100300);

    }
}
