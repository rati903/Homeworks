public class Cake extends Product {
    private double weight;

    public Cake(double price, int term, double weight) {
        super(price, term);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Weight: " + weight + "kg");
    }
}

