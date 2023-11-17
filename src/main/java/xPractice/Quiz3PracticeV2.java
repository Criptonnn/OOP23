package xPractice;

class Quiz3PracticeV2 {
    public static void main(String[] args) {
        Animal2 a1 = new Dog2();

        Animal2 a2 = new Dog2();
        if(a2 instanceof Dog2) {
            Dog2 d3 = (Dog2) a2;
        }


    }
}

class Animal2 {

}

class Dog2 extends Animal2 {
    public Dog2() {

    }
}

class Bird extends Animal2 {

}