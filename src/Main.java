public class Main {
    public static void main(String[] args) {
        Milk milk1 = new Milk(2.5, 8, 2.5);
        Milk milk2 = new Milk(3.0, 10, 2.0);

        Cake cake1 = new Cake(20.0, 4, 1.3);
        Cake cake2 = new Cake(15.0, 3, 0.8);

        Sandwich sandwich1 = new Sandwich(6.0, 2, 17.0);
        Sandwich sandwich2 = new Sandwich(8.0, 3, 20.0);

        Product[] products = new Product[6];
        products[0] = milk1;
        products[1] = milk2;
        products[2] = cake1;
        products[3] = cake2;
        products[4] = sandwich1;
        products[5] = sandwich2;

        Store store = new Store(products);

        System.out.println("Products in the Store:");
        for (Product product : store.getProducts()) {
            product.displayProductInfo();
            System.out.println();
        }
    }
}
