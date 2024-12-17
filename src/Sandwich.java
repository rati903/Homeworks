public class Sandwich extends Product {
    private double length;

    public Sandwich(double price, int term, double length) {
        super(price, term);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Length: " + length + "cm");
    }
}
