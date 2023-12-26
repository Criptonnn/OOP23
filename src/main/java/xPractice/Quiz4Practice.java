package xPractice;

//You are working on a Java project where you need to introduce a simple mechanism for marking certain fields as "configurable."
//Create a custom exception named MyConfigException that extends the appropriate base exception class.
//Use this custom exception to handle any errors that may occur during the following program.
//Define a custom annotation named ConfigurableField that can be applied to fields in a Java class.

//Create a class called Settings with the following fields username,
//password, and timeout. Apply the custom annotation to username and password only.
//Implement a method named saveConfigurableFields in a separate class named ConfigSaver.
//This method should take an object and use reflection to save the names of the fields annotated with ConfigurableField into a
//file passed in the filename parameter in the format fieldname=fieldvalue (repeat this for each field).
//Write a test to confirm that the code in the main method has 2 written lines of code after execution.

import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

class MyConfigException extends RuntimeException {
    public MyConfigException(String message) {
        super(message);
    }
}
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ConfigurableField {}

class Settings {
    @ConfigurableField
    private String username;
    @ConfigurableField
    private String password;
    private int timeout;

    public Settings(String username, String password, int timeout) {
        this.username = username;
        this.password = password;
        this.timeout = timeout;
    }
}

class ConfigSaver {
    private int lineCount;

    public int getLineCount() {
        return lineCount;
    }

    public void saveConfigurableFields(Settings settings, String filename) {
        lineCount = 0;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for(Field field : settings.getClass().getDeclaredFields()) {
                if(field.isAnnotationPresent(ConfigurableField.class)) {
                    field.setAccessible(true);
                    Object obj = field.get(settings);
                    if(obj instanceof String fieldValue) {
                        writer.write(field.getName() + "=" + fieldValue);
                        lineCount++;
                    }
//                    writer.write(field.getName() + "=" + field.get(settings) + "\n");
                }
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public int countLines(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int lineCount = 0;
            String temp;
            while((temp = reader.readLine()) != null) {
                lineCount++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return lineCount;
    }

}

class EvenPositionIteratior implements Iterator<Integer> {

    private int[] numbers;
    private int index = 0;

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        while(index < numbers.length) {
            if(index%2==0) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Integer next() {
        if(!hasNext()) throw new NoSuchElementException();
        return numbers[index++];
    }
}


class Quiz4Practice {
    public static void main(String[] args){
        Settings settings = new Settings("user123", "pwd123", 142);
        ConfigSaver saver = new ConfigSaver();
        saver.saveConfigurableFields(settings, "myfile2.txt");
        System.out.println(saver.countLines("myfile2.txt"));
//        System.out.println(saver.countLines("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\myfile.txt"));
        int[] num = {0,1,2,3,4,5,6,7,8,9,10};
        EvenPositionIteratior iteratior = new EvenPositionIteratior();
        iteratior.setNumbers(num);
        while(iteratior.hasNext()) {
//            System.out.println(iteratior.next());
            break;
        }
    }
}
