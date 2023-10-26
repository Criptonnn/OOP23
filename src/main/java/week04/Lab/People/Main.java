package week04.Lab.People;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment(List<Person> people) {
        for(Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
//        Person emir = new Person("Emir", "Azici 82");
        //System.out.println(emir);

//        Teacher haki = new Teacher("Haris", "Krajina", 1000);
        //System.out.println(haki);

        List<Person> people = new ArrayList<>();
//        people.add(new Person("Emir", "Azici 82"));
//        people.add(new Teacher("Haki", "Bihac", 2000));

        printDepartment(people);

    }

}
