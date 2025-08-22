package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals((colour)) ? Discount.RED_APPLE_DISCOUNT : 0 ; //для красных - скидка, зеленых - нет
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
