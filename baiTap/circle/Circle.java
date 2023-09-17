package baiTap.circle;

public class Circle {
    protected double radius;
    protected String color;
    protected double s;
    private final double PI=3.14;

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getS(){
        s=PI*Math.pow(radius,2);
        return s;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
