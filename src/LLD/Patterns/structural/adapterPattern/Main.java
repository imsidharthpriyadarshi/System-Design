package LLD.Patterns.structural.adapterPattern;

import LLD.Patterns.structural.adapterPattern.adaptee.PoundToKgAdapter;
import LLD.Patterns.structural.adapterPattern.existing.BabyWeightMachine;

public class Main {
    public static void main(String[] args) {
        AdapterWeightMachine weightMachine= new PoundToKgAdapter(new BabyWeightMachine());
        System.out.println(weightMachine.getWeight());
    }
}
