package week04.Lab.Shapes;

public class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public void displayInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Filled: " + this.fillType);
    }

    public double getArea() {
        return -1;
    }


    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Blue", FillType.FILLED, 50.5, 30.75);
        //System.out.println(rec.getArea());
    }
}
