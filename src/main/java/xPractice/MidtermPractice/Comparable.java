package xPractice.MidtermPractice;

import java.util.ArrayList;
import java.util.Collections;

class Someone implements Comparable<Someone> {
    private String name;
    private int age;

    public Someone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Someone someoneElse) {
        if(this.age == someoneElse.getAge()) return 0;
        if(this.age > someoneElse.getAge()) return 1;
        return -1;
    }

}

class Comparablee {
    public static void main(String[] args) {
        Someone s1 = new Someone("Emir", 20);
        Someone s2 = new Someone("Amar", 23);
        Someone s3 = new Someone("Nule", 60);
        ArrayList<Someone> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        for(Someone s : list) {
            System.out.println(s.getName());
        }
    }
}
