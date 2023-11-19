package xPractice.MidtermPractice;

import java.util.Objects;

class Pizza {
    private int size;
    private String name;

    public Pizza(int size, String name) {
        this.name = name;
        this.size = size;
    }
    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(!(object instanceof Pizza)) return false;
        Pizza other = (Pizza) object;
        return Objects.equals(size, other.size) && Objects.equals(name, other.name);
    }
}

class Equals {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(10, "margarita");
        Object pizza2 = new Pizza(10, "margarita");
        System.out.println(pizza1.equals(pizza2));

        APerson person = new APerson("Emir");
        System.out.println(person);
    }
}

record APerson(String name, String address) {
    public APerson(String name) {
        this(name, "Unknown");
    }
}