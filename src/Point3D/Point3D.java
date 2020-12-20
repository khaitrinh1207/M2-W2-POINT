package Point3D;

import Poin2D.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0;
    public Point3D(){}
    public Point3D(float x,float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x="+getX()+
                " y="+getY()+
                " z=" + z +
                " arr[]"+Arrays.toString(getXYZ())+
                " }";
    }
}
