package xPractice;

class Quiz2 {
}

enum Color {
    RED,
    BLUE,
    GREEN
}

class Animal {
    private String name;
    private int age;
    private Color color;

    public Animal(String name) {
        this.name = name;
    }
    public Animal(Color color) {
        this.color = color;
    }

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String makeNoise() {
        return "Animal noise";
    }
}

class Tiger extends Animal {
    private int numOfTeeth;

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    public Tiger(String name, int age, Color color, int numOfTeeth) {
        super(name, age, color);
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String makeNoise() {
        return "Tiger noise";
    }
}

class Lion extends Animal {
    private int weight;
    public Lion(String name, int weight) {
        super(name);
        this.weight = weight;
    }
}