import java.util.ArrayList;
import java.util.List;

public class hotvenderavtomat implements VenderingMachine {

    private final List<Product> productList;

    private int money;

    private int temp;

    public hotvenderavtomat(List<Product> productList) {
        this.productList = productList;
    }

    private List<Product> initProduct() {
        System.out.println( productList );
        List<Product> products = new ArrayList<>();
        products.add(new HotBottle("Tee", 60, 30 , 2 ));
        products.add(new HotBottle("Coffee", 60, 30 , 1 ));
        products.add(new HotBottle("Chocolate", 60, 30 , 5 ));
        return products;
    }

    @Override
    public Product getProduct(String name) {
        for(Product product : productList) {
            if (product.getname().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }



    public  HotBottle getProduct(String name, int volume, int temp) {
        for(Product product : productList) {
            if (product instanceof HotBottle) {
                if (product.getname().equals(name) && product.getPrice() == volume && product.getPrice() == temp) {
                    return (HotBottle) product;
                }
            }
        }
        return null;
    }
}

}
