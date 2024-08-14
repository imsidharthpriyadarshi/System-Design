package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm;

public abstract class AtmTransaction {

   public abstract boolean readAtmNumber();
    public abstract boolean matchPin();


    public abstract boolean notesHandle();

    public abstract boolean debitAmount();

    public abstract boolean giveNotes();

    private  boolean authentication(){
        if (readAtmNumber()){
            if (matchPin())return true;
        }
        return false;

    }
    public final boolean doTransaction(){
        if (authentication()){
            if (notesHandle()){
                if (debitAmount()){
                    return giveNotes();
                }

            }
        }
        return false;
    }


}
