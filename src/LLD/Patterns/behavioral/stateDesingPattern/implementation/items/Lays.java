package LLD.Patterns.behavioral.stateDesingPattern.implementation.items;

import LLD.Patterns.behavioral.stateDesingPattern.implementation.Item;

public class Lays implements Item {
    private double price;
    private int quantity;
    private int id;

    public Lays(double price, int quantity, int id) {
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }
}
