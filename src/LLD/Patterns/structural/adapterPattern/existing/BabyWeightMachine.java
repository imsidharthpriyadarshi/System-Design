package LLD.Patterns.structural.adapterPattern.existing;

import LLD.Patterns.structural.adapterPattern.ExistingWeightMachine;

public class BabyWeightMachine implements ExistingWeightMachine {
    @Override
    public double getWeight() {
        return 28;
    }
}
