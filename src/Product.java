public class Product {
    private double price;
    private int term;

    public Product(double price, int term) {
        this.price = price;
        this.term = term;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
    public void displayProductInfo() {
        System.out.println("Price: $" + price + ", Term: " + term + " days");
    }
}
