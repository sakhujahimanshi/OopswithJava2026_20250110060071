import java.util.*;

class Product {
    int ProductId;
    String ProductName;
    int Price;

    public Product(int ProductId, String ProductName, int Price) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Price = Price;
    }
}

class ProductPriceSystem implements Comparator<Product> {
    @Override
    public int compare(Product P1, Product P2) {
        return P1.Price - P2.Price;
    }
}

class ProductPriceSystem2 {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Mouse", 500);
        Product p2 = new Product(102, "Keyboard", 1000);
        Product p3 = new Product(103, "Headphone", 2000);
        Product p4 = new Product(104, "Laptop", 50000);

        ArrayList<Product> productList = new ArrayList<>();

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        Collections.sort(productList, new ProductPriceSystem());

        for (Product p : productList) {
            System.out.println(p.ProductId + " " + p.ProductName + " " + p.Price);
        }
    }
}