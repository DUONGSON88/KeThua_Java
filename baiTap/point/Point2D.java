package baiTap.point;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    Point2D(){
    }
    Point2D(float x , float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x=x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y) {
    this.x=x;
    this.y=y;
    }
    public float[] getXY(){
        float[] arr;
        return  arr = new float[]{getX(), getY()};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(getXY()) +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        Point2D a= new Point2D();
        Point2D b=new Point2D(1f,2f);
        System.out.println(a);
        System.out.println(b);
        b.setX(3);
        System.out.println(b);
    }
}
