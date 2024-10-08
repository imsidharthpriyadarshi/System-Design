package LLD.Patterns.behavioral.iterator.types;

public class Book {
    private String title;
    private int price;
    private int quantity;

    public Book(String title, int price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: "+this.title+
                " Price: "+this.price+
                " Quantity: "+this.quantity;
    }
}
