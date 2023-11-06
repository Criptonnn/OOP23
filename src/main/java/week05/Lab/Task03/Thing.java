package week05.Lab.Task03;

public class Thing {
    private final double weight;
    private String name;

    public Thing(double weight) throws IllegalAccessException {
        if(weight >= 0) {
            this.weight = weight;
        }
        else {
            throw new IllegalAccessException();
        }
    }
    public Thing(String name, double weight) throws IllegalAccessException {
        if(weight >= 0) {
            this.weight = weight;
            this.name = name;
        }
        else {
            throw new IllegalAccessException();
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}
