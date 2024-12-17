public class Milk extends Product {
    private double volume;

    public Milk(double price, int term, double volume) {
        super(price, term);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Volume: " + volume + "L");
    }
}
