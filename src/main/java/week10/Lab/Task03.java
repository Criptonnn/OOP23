package week10.Lab;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Events {
    public static void generateEventsFile(String filename, int numberOfRecords) {
        String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\OneDrive\\Radna površina\\Skola\\YEAR 02\\java\\" + filename + ".txt"));
            Random random = new Random();
            for(int i = 0; i < numberOfRecords; i++) {
                LocalDateTime timestamp = LocalDateTime.now().minusDays(random.nextInt(365)).minusHours(random.nextInt(24)).minusMinutes(random.nextInt(60));
                String eventType = eventTypes[random.nextInt(eventTypes.length)]; // od 0 do lenght ne ukljucujuci length
                int id = random.nextInt(998) + 1;
                writer.write(timestamp + " - " + eventType + " - " + id + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readEventsFile(String filename) {
        Path path = Paths.get(filename);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\OneDrive\\Radna površina\\Skola\\YEAR 02\\java\\" + filename + ".txt"));
            List<String> lines = reader.lines().toList();
            for(String line : lines) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Task03 {
    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextInt(5));
        Events.generateEventsFile("task03", 10);
        Events.readEventsFile("task03");
    }
}
