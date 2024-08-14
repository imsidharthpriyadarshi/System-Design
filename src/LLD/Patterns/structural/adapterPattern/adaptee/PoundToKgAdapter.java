package LLD.Patterns.structural.adapterPattern.adaptee;

import LLD.Patterns.structural.adapterPattern.AdapterWeightMachine;
import LLD.Patterns.structural.adapterPattern.ExistingWeightMachine;

public class PoundToKgAdapter implements AdapterWeightMachine {
    private ExistingWeightMachine existingWeightMachine;
    public PoundToKgAdapter(ExistingWeightMachine existingWeightMachine){
        this.existingWeightMachine=existingWeightMachine;
    }
    @Override
    public double getWeight() {
       return existingWeightMachine.getWeight()*0.45;
    }
}
