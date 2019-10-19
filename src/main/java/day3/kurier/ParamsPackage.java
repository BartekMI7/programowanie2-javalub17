package day3.kurier;

public class ParamsPackage {
    private int height;
    private int width;
    private int length;
    private double weight;

    public ParamsPackage(int height, int width, int length, double weight) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
}
