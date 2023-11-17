package xPractice;


import java.util.ArrayList;
import java.util.Collections;

interface Runnable {
    void run();
}

class Dog implements Runnable{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("run run run");
    }

    public String getName() {
        return this.name;
    }
}

class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }
}

class Retriever extends Dog {
    public Retriever(String name) {
        super(name);
    }
}

class DogPrinter<T extends Dog> {
    private T printItem;

    public DogPrinter(T printItem) {
        this.printItem = printItem;
    }

    public T getPrintItem() {
        return this.printItem;
    }

    public void setPrintItem(T newPrintItem) {
        this.printItem = newPrintItem;
    }
}
// COMPARABLE INTERFACE, KORISTENJE compareTo() METODE ZA UPOREDJENJE OBJEKATA KAKO BI ZNALI PO CEMU DA IH SORTAMO

class Human implements Comparable<Human> {
    private String name;
    private int age;
    public Human(String name, int age) {
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

    @Override
    public int compareTo(Human human) {
        if(this.age == human.getAge()) {
            return 0;
        }
        if(this.age > human.getAge()) {
            return -1; // NEGATIVAN BROJ, ZNACI DA IDE PRIJE AKO JE VECI, STO ZNACI DA JE DESCENDING JER IDE OD NAJVECEG DO NAJMANJEG
        }
        return 1;
    }

    public String toString() {
        return this.name + " - " + this.age;
    }
}

// ABSTRACTION

interface Payable {
    String makePayment();
}
class Card implements Payable {
    private String cardNumber;
    private int limit;

    public Card(String cardNumber, int limit) {
        this.cardNumber = cardNumber;
        this.limit = limit;
    }
    public int pay() {
        return 100;
    }
    @Override
    public String makePayment() {
        return "Payment made";
    }
}

class CreditCard extends Card {
    private int weight;

    public CreditCard(String cardNumber, int limit, int weight) {
        super(cardNumber, limit);
        this.weight = weight;
    }
}

class DebitCard extends Card {
    private int length;

    public DebitCard(String cardNumber, int limit, int length) {
        super(cardNumber, limit);
        this.length = length;
    }
}


class PrintThing<T> {
    private T thing;
    private int broj;

    public PrintThing(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }

    public void printMe() {
        System.out.println(this.thing);
    }
}

class Print extends PrintThing {
    public Print(Object thing) {
        super(thing);
    }
}

class Bank<T extends Card> {
    private T card;

    public Bank(T card) {
        this.card = card;
    }

    public int getPayNesto() {
        return card.pay();
    }
}

class Quiz3Prep {
    public static <T extends Dog> void printDog(T thing) {
        System.out.println("The dog name is: " + thing.getName());
    }

    public static void main(String[] args) {
        Dog dog = new Dog("ker");
        Labrador labrador = new Labrador("Bobi");

        Dog str = new Dog("ime");
        printDog(str);

        DogPrinter<Labrador> dogDogPrinter = new DogPrinter<Labrador>(labrador);
        System.out.println(dogDogPrinter.getPrintItem());

        printDog(dog);

        Human h1 = new Human("Emir", 20);
        Human h2 = new Human("Faris", 25);
        Human h3 = new Human("Edo", 30);

        ArrayList<Human> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);

        for(Human h : list) {
            System.out.println(h);
        }

        Collections.sort(list);

        System.out.println("----");

        for(Human h : list) {
            System.out.println(h);
        }
    }
}