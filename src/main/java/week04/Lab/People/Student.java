package week04.Lab.People;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{
    private int credits;
    private int studentId;
    private ArrayList<Integer> grades;

    public Student(String name, String address, int age, String country, int credits, int studentId, ArrayList<Integer> grades) {
        super(name, address, age, country);
        this.credits = 0;
        this.studentId = studentId;
        this.grades = grades;
    }

    public int getCreddits() {
        return credits;
    }

    public void setCredits(int creddits) {
        this.credits = credits;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void study() {
        this.credits++;
    }

    public void addGrade(int grade) {
        if(grade > 0 && grade < 6) {
            this.grades.add(grade);
        }
        else {
            System.out.println("NE VALJA");
        }
    }
}
