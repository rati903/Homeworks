   public class Circle extends Figure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
       }

       public double getRadius() {
        return radius;
    }

       public void setRadius(double radius) {
           this.radius = radius;
       }
   }
