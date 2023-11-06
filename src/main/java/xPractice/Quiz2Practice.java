package xPractice;

class Quiz2Practice {
}

class Animal11 {
    private String name;
    private int age;

    public Animal11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + ", age: " +this.age;
    }

    public static void main(String[] args) {
        Animal11 ker = new Animal11("Reks", 15);
        System.out.println(ker);
    }
}
