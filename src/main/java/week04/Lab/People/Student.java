package week04.Lab.People;

public class Student extends Person{
    private int credits;

    public Student(String name, String address, int credits) {
        super(name, address);
        this.credits = 0;
    }

    public int getCreddits() {
        return credits;
    }

    public void setCredits(int creddits) {
        this.credits = credits;
    }

    public void study() {
        this.credits++;
    }
}
