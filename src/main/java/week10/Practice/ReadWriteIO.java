package week10.Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadWriteIO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\OneDrive\\Radna površina\\Skola\\YEAR 02\\java\\output.txt"));
            writer.write("Danas je lijep dan");
            writer.write("\nruzan je dan realno");
            writer.write("\nhehehehehe");
            writer.write("\nhoohohohoho");
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\OneDrive\\Radna površina\\Skola\\YEAR 02\\java\\output.txt"));
//            System.out.println(reader.readLine());
            String temp;
            while((temp = reader.readLine()) != null) System.out.println(temp);
            reader.close();
        } catch(IOException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
