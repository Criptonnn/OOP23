package week11.Lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Task01Test {

    @BeforeEach
    void setup() {
        // ne radi kako ocekujem :(
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
    }


    @AfterEach
    void confirmation() {
        System.out.println("Test finished successfully");
    }

    @Test
    void testIfStudentisPresent() {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
//        assertNotEquals(true, system.getStudentList().isEmpty());
        assertTrue(system.getStudentList().size() > 0, "there is at least noe student in the list");
    }

    // double check
    @Test
    void testStudentWithId100() throws StudentNotFoundException {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        System.out.println(system.getStudentById(100));
        assertFalse(system.getStudentById(100).isEmpty(), "there is no student with id 100");
    }

    @Test
    void testStudentNull() throws StudentNotFoundException {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertNull(system.getStudentById(1));
    }

    @Test
    void highestGPAStudent() {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertNotNull(system.getHighestGPAStudent(), "there is a student with a highest GPA");
    }

    @Test
    void testExceptionForEmptyStudentList() {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertThrows(EmptyStudentListException.class, () -> system.getHighestGPAStudent());
    }

    @Test
    void testSize() {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertEquals(70, system.getStudentList().size());
    }

    @Test
    void testLargestName() {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertNotEquals("Ava White", system.getLongestNameStudent().getName());
    }

    @Test
    void testStudents() {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertSame(system.getHighestGPAStudent(), system.getLongestNameStudent());
    }


    // MORAMO DODATI NA PRVI .get() DA BI UNWRAPPALI OPTIONAL
    @Test
    void testSameStudent() throws StudentNotFoundException {
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
        assertSame(system.getStudentById(12).get(), system.getHighestGPAStudent());
    }
}