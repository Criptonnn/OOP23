package week04.Lab.Shapes;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
