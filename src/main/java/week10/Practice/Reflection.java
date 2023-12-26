package week10.Practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Parrot {
    private String color;
    private int age;

    public Parrot(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void printColor() {
        System.out.println("This parrot is " + this.color);
    }
}

class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Parrot parrot = new Parrot("Red", 10);

        Field[] parrotFields = parrot.getClass().getDeclaredFields();
        for(Field field : parrotFields) {
            field.setAccessible(true);
            if(field.getName().equals("color")) {
                System.out.println(field.get(parrot));
                field.set(parrot, "Blue");
            }
        }

        Method[] parrotMethods = parrot.getClass().getDeclaredMethods();
        for(Method method : parrotMethods) {
            if(method.getName().equals("printColor")) {
                method.setAccessible(true);
                method.invoke(parrot);
            }
        }
    }
}
