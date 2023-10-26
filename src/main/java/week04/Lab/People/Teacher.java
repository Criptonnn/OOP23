package week04.Lab.People;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int age, String country, int salary) {
        super(name, address, age, country);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + this.salary;
    }
}
