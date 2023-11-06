package week05.Lecture;



abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound(); // MORA KLASA BITI ABSTRACT I NE MOZEMO OVDJE KOD PISATI
    public String sayMyNameLoud() {
        return "LOUD NAME IS: ".concat(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String makeSound() {
        return "aww";
    }

    public void dogdog() {
        System.out.println("dogdog");
    }
}

class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    public String makeSound() {
        return "GRR";
    }

    public String lionRuns() {
        return "runrunrun";
    }
}

class Ant implements Animable, Becirable {
    public String run() {
        return "MRAV TRCI";
    }

    public String shout() {
        return "AAAAAAAAAA";
    }
}

interface Animable {
    String run();
}

interface Becirable {
    String shout();
}

class startProgram {
    public static void main(String[] args) {

        Animable a = new Ant();

    }
}