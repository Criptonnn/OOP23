package week04.Lecture;


enum Color {
    RED,
    BLACK,
    BLUE
}

enum FuelType {
    DIESEL,
    PETROL
}
class Vehicle {
    private int numOfGears;
    private int numOfWheels;
    private Color color;

    public Vehicle(int numOfGears, int numOfWheels, Color color) {
        this.numOfGears = numOfGears;
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(int numOfGears) {
        if(numOfGears <= 0) {
            System.out.println("NE VALJA");
            return;
        }
        this.numOfGears = numOfGears;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void makeNoise() {
        System.out.println("ANNN ANNNNNN");
    }
}

class Car extends Vehicle {
    private FuelType fuelType;

    public Car(FuelType fuelType, int numOfGears, int numOfWheels, Color color) {
        super(numOfGears, numOfWheels, color);
    }

    @Override // funckciju makeNoise koju smo inheritali sa Vehicle klase sada overridamo specificno za Car klasu(nije obavezno pisati @Override ali je dobar practice)
    public void makeNoise() {
        System.out.println("BRMMM BRMMMMMM bang bang bang");
    }
}

class Bicycle extends Vehicle {
    private boolean hasDinama;

    public Bicycle(int numOfGears, int numOfWheels, Color color, boolean hasDinama) {
        super(numOfGears, numOfWheels, color); // super() pozove konstuktor parent klase i u zagrade super() stavljamo argumente koji bi odgovarali za parent konstruktor
        this.hasDinama = hasDinama;
    }
}