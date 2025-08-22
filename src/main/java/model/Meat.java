package model;

public class Meat extends Food {

    public Meat(int amount, double price, boolean isVegetarian) {
        super(amount, price, isVegetarian);
        this.isVegetarian = false;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}





