package week05.Lab.Task02;

public class Book extends Thing implements ToBeStored{
    private String writer;
    private String name;
    //private double weight; definisano u parent klasi Thing

    public Book(String writer, String name, double weight) {
        super(weight);
        this.writer = writer;
        this.name = name;
        //this.weight = weight;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }

    public double weight() {
        return 0;
    };
}
