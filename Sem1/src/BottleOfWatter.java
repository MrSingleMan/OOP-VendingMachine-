public class BottleOfWatter extends Product{

    private double volume;

    public BottleOfWatter(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWatter{" +
                "volume=" + volume + ", name=" +getName() +
                '}';
    }

}
