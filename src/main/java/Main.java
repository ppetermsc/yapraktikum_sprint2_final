import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100, false);
        Apple redApples = new Apple(10, 50, true, RED);
        Apple greenApples = new Apple(8, 60, true, GREEN);

        Food [] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки - %.1f руб.%n", cart.getTotalNoDiscount());
        System.out.printf("Общая сумма товаров со скидкой - %.1f руб.%n", cart.getTotalWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки - %.1f руб.%n",
                cart.getTotalVegetarianNoDiscount());

    }
}
