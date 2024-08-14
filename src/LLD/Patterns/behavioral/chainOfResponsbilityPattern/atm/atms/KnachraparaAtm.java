package LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.atms;

import LLD.Patterns.behavioral.chainOfResponsbilityPattern.atm.AtmTransaction;

public class KnachraparaAtm extends AtmTransaction {
    @Override
    public boolean readAtmNumber() {
        return false;
    }

    @Override
    public boolean matchPin() {
        return false;
    }

    @Override
    public boolean notesHandle() {
        return false;
    }

    @Override
    public boolean debitAmount() {
        return false;
    }

    @Override
    public boolean giveNotes() {
        return false;
    }
}
