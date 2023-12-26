package xPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigSaverTest {


    @Test
    void isTheNumberOfLinesEqualTo2() {
        Settings settings = new Settings("user123", "pwd123", 142);
        ConfigSaver saver = new ConfigSaver();
        saver.saveConfigurableFields(settings, "C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\myfile.txt");
        assertEquals(2, saver.getLineCount(), "The number of lines should be equal to 2!");
    }
}