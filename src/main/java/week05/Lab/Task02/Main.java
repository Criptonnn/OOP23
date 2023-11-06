package week05.Lab.Task02;

public class Main {
    public static void main(String[] args) {
        Book knjiga = new Book("Emir", "Antigona", 0.5);
        System.out.println(knjiga);
        CD disk = new CD("Mobb Deep", "Trife Life", 1989);
        System.out.println(disk);

        Thing stvar = new Book("Emir", "ADWA", 6.5);
        Thing cede = new CD("Emir ponovo", "Oh no", 2011);

        //Book book = new Book("Mos Def", "Love", 5 );
        //book.getWeight();


        Box box = new Box(10);
        box.add(stvar);
        box.add(cede);
        System.out.println(box);

        box.add(new Book("Knjiga", "Ef", 5));

        System.out.println(box);
    }
}
