package xPractice.MidtermPractice;

class Records {
    public static void main(String[] args) {
        Person emir = new Person("Emir", 20);
        Person amar = new Person("Emir", 20);
        System.out.println(emir.equals(amar));
    }
}

record Person(String name, int age) {}