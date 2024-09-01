import java.util.List;

public class BottleMachine implements VendingMachine{

    private int money;

    private final List<Product> productList;

    public BottleMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }



    public BottleOfWatter getProduct(String name, int volume) {
        for (Product product: productList) {
            if (product instanceof BottleOfWatter) {
                if (product.getName().equals(name) && ((BottleOfWatter) product).getVolume() == volume) {
                    return (BottleOfWatter) product;
                }
            }
        }
        return null;
    }
}
