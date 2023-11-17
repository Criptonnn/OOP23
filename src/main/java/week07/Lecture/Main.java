package week07.Lecture;

import java.util.Optional;

class Main {
    public static void main(String[] args) {
        Person covjek = new Person("Haki");
        covjek.drink();
        covjek.drinkTea();
    }
}

abstract class Drink {
    public abstract void drink();

    public void drinkTea() {
        System.out.println("pijem caj");
    }
}

class Person extends Drink {
    public String name;

    public Person(String name) {
        this.name = name;
    }
    public void drink() {
        System.out.println("pijem nesto i covjek sam");
    }

}

@FunctionalInterface
interface OperationInterface { // FUNCTIONAL INTERFACE IMA SAMO 1 METHOD I NA NJIH MOZEMO LAMBDE FUNC KORISTIT
    int operation(int a, int b);
}
interface MessageInterface {
    String saySomething(String something);
}

class TestLambdas {
    public static void main(String[] args) {
        MessageInterface messageInterface = mySomething -> "Hello";
        MessageInterface messageInterface1 = (mySomething) -> {
            return "Hello";
        };

    }
}


record Elephant(String name, int age) {

}

class OptionalTesting {
    public static void main(String[] args) {

    }

    public static Elephant getElepthant() {
        return null;
    }
}