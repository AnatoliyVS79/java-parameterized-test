import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(new Food[]{
                new Apple(8, 60, Colour.GREEN),
                new Apple(10, 50, Colour.RED),
                new Meat(5, 100)});

        double totalAmount = shoppingCart.getTheTotalAmountWithoutDiscount();
        double totalAmountWithDiscount = shoppingCart.getTheTotalAmountFromTheDiscount();
        double amountWithoutDiscount = shoppingCart.getTheTotalAmountOfVegetarianItemsWithoutDiscount();

        System.out.println("Общая сумма товаров без скидки - " + totalAmount);
        System.out.println("Общая сумма товаров со скидкой - " + totalAmountWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидки - " + amountWithoutDiscount);
    }
}
