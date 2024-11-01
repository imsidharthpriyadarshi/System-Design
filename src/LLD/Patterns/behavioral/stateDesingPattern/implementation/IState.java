package LLD.Patterns.behavioral.stateDesingPattern.implementation;

import LLD.Patterns.behavioral.stateDesingPattern.implementation.product.VendingMachine;

public interface IState {

    void clickOnInsertButton(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine);
    void startProductSelection(VendingMachine vendingMachine);
    void chooseProduct(VendingMachine vendingMachine);
    void dispanceProduct(VendingMachine vendingMachine);
    void refundRequested(VendingMachine vendingMachine);



}
