public class HotDrink extends BottleOfWatter{
    private int temperature;

    public HotDrink(String name, int price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{name " + getName() + " volume " + getVolume() + "l. price: " + getPrice() +
                "p. temperature: " + temperature +
                '}';
    }
}
