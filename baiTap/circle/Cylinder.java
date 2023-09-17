package baiTap.circle;

public class Cylinder extends Circle {
    private double chieuCao;

    public Cylinder(double radius, String color) {
        super(radius, color);
    }


    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getTheTich() {
        return getS() * this.chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", dien tich Day=" + getS() +
                "The tich= " + getTheTich() +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Cylinder a = new Cylinder(3, "red");
        System.out.println(a);
        System.out.println(a.getS());

        Cylinder b = new Cylinder(3.2, "black", 6.3);
        System.out.println(b);
    }
}
