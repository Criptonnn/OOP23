package week05.Lecture;

import java.util.Calendar;

public class Person {
    public String name1;
    public String name2;
    public int num1;
    public int num2;

    Person(int num1, String name1) {
        this.num1 = num1;
        this.name1 = name1;
    }
    Person(String name2, int num2) { // MOZEMO OVAKO AKO PRVO IDE (int, String) PA ONDA (String, int) RADIT CE, AKO JE ISTI REDOSLJED, NE RADI
        this.num2 = num2;
        this.name2 = name2;
    }

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getWeekYear());
    }
}