package week10.Lab;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;

class Student {
    private String name;
    private int ID;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int ID, ArrayList<Integer> grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }


}

class GradeAnalyzer {
    private ArrayList<Integer> grades = new ArrayList<>();

    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage(ArrayList<Integer> grades) {
        double average;
        int sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        average = sum/grades.size();
        return average;
    }

    private void printSummary() {
        System.out.println("Summary: average = " + calculateAverage(this.grades));
    }
}

class Start {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        GradeAnalyzer analyzer = new GradeAnalyzer(list);

//        Method[] methods = analyzer.getClass().getMethods(); NIJE GETMETHODS NEGO GETDECLAREDMETHODS!!!!!!
        Method[] methods = analyzer.getClass().getDeclaredMethods();
        for(Method method : methods) {
//            System.out.println(method.getName());
            if(method.getName().startsWith("calculate")) { // startsWith() reflection API fazon
                System.out.println(method.getName());
                System.out.println(method.invoke(analyzer, analyzer.getGrades()));
            }
            if(method.getName().startsWith("print")) {
                method.setAccessible(true);
                System.out.println(method.getName());
                method.invoke(analyzer);
            }
        }
    }
}
class Task02 {
}
