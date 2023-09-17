package baiTap.point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    float[] arr2;
    Point3D(float x,float y){
        super(x,y);
    }
    Point3D(float x , float y , float z){
        super(x ,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
    setXY(x,y);
    setZ(z);
    }
    public float[] getXYZ(){
        return arr2=new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x"+getX()+
                ", y="+getY()+
                ", z=" + z +
                ", arr2=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
class Main2{
    public static void main(String[] args) {
        Point3D c= new Point3D(1f,23f,4f);
        System.out.println(c);
        System.out.println(c.getX());
        System.out.println(Arrays.toString(c.getXY()));
        c.setXYZ(3,5,6);
        System.out.println(c);
    }
}