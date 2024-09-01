import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine{
    private List<HotDrink> hotDrinks = new ArrayList<>();

    public void addHotDrink(HotDrink drink) {
        hotDrinks.add(drink);
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int price) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getPrice() == price) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int price, int temperature) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getPrice() == price && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}

