package week06.Lab.Birdwatchers;

import java.util.ArrayList;
import java.util.Scanner;

public class Birdwatcher {
    private ArrayList<Bird> birdList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Birdwatcher() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String nameInput = scanner.nextLine();
                    System.out.print("Latin name: ");
                    String latinInput = scanner.nextLine();

                    birdList.add(new Bird(nameInput, latinInput));
                    break;

                case "Observation":
                    System.out.print("What was observed: ");
                    nameInput = scanner.nextLine();
                    boolean found = false;
                    for(Bird bird : birdList) {
                        if(nameInput.equals(bird.getName())) {
                            bird.setObservations(bird.getObservations() + 1);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("It is not a bird!");
                    }
                    break;

                case "Statistics":
                    for(Bird bird : birdList) {
                        System.out.println(bird);
                    }
                    break;

                case "Show":
                    System.out.print("What: ");
                    nameInput = scanner.nextLine();
                    for(Bird bird : birdList) {
                        if (nameInput.equals(bird.getName())) {
                            System.out.println(bird);
                        }
                    }
                    break;

                case "Quit":
                    System.exit(0);
                    break;
            }
        }
    }



}
