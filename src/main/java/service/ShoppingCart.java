package service;

import model.Apple;
import model.Discountable;
import model.Food;
import model.constants.Colour;

public class ShoppingCart {

    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalNoDiscount (){

        double total = 0.0;
        for(Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0.0;
        for(Food item : items)  {
            double itemTotal = item.getAmount() * item.getPrice();
            double discount;
            if (item instanceof Discountable) { // Проверка, есть ли скидка
                discount = ((Discountable) item).getDiscount();
            } else {
                discount = 0; // Без скидки
            }
            total += itemTotal - (itemTotal * discount / 100);
        }
        return total;
    }

    public double getTotalVegetarianNoDiscount(){

        double total = 0.0;
        for(Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
