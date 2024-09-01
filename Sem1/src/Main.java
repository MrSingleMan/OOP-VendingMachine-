public class Main {
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Coffee", 200, 0.2, 80);
        HotDrink tea = new HotDrink("Tea", 150,0.5, 100);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 250, 0.1, 90);

        HotDrinkMachine vendingMachine = new HotDrinkMachine();
        vendingMachine.addHotDrink(coffee);
        vendingMachine.addHotDrink(tea);
        vendingMachine.addHotDrink(hotChocolate);

        System.out.println(vendingMachine.getProduct("Coffee")); // Поиск по имени
        System.out.println(vendingMachine.getProduct("Tea", 150)); // Поиск по имени, объему и температуре
        System.out.println(vendingMachine.getProduct("Hot Chocolate", 250, 50)); // Нет продукта с такой температурой
    }
}