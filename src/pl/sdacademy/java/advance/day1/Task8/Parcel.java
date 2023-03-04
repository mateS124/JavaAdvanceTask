package pl.sdacademy.java.advance.day1.Task8;

public class Parcel  {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpres;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpres) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpres = isExpres;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpres() {
        return isExpres;
    }
}
