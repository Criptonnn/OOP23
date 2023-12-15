package week11.Lab;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message) {
        super(message);
    }
}


class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    public Student(int id, String name, String university, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class StudentSystem {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public StudentSystem(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
             List<String> studentValueList = reader.lines().toList();

            for(String line : studentValueList) {
                String[] studentValues = line.split(",");
//                System.out.println(studentValues);
                Student tempStudent = new Student(Integer.parseInt(studentValues[0]), studentValues[1], studentValues[2], studentValues[3], Double.parseDouble(studentValues[4]));
                studentList.add(tempStudent);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Optional<Student> getStudentById(int id) throws StudentNotFoundException {
        if(id > studentList.size()) return Optional.ofNullable(null);
        for(Student s : this.studentList) {
            if(s.getId() == id) {
                return Optional.of(s);
            }
        }
        throw new StudentNotFoundException("student not found!");
    }

    public Student getHighestGPAStudent() {
        if(this.studentList.isEmpty()) throw new EmptyStudentListException("the student list is empty!");
        else {
            Student maxGpaStudent = studentList.get(0);
            for(Student s : this.studentList) {
                if(s.getGpa() > maxGpaStudent.getGpa()) {
                    maxGpaStudent = s;
                }
            }
            return maxGpaStudent;
        }
    }

    public Student getLongestNameStudent() {
        if(this.studentList.isEmpty()) throw new EmptyStudentListException("The list is empty!");
        else {
            Student longNameStudent = this.studentList.get(0);
            for(Student s : this.studentList) {
                if(s.getName().length() > longNameStudent.getName().length()) {
                    longNameStudent = s;
                }
            }
            return longNameStudent;
        }
    }
}

class Task01 {
    public static void main(String[] args) throws StudentNotFoundException{
        StudentSystem system = new StudentSystem("C:\\Users\\User\\IdeaProjects\\ObjectOrientedProgramming\\src\\main\\java\\week11\\students.csv");
//        for(Student student : system.getStudentList()) {
//            System.out.println(student);
//        }
        Optional<Student> studentId10 = system.getStudentById(10);
        if(studentId10.isPresent()) {
            System.out.println(studentId10);
        } else {
            throw new StudentNotFoundException("student not found!");
        }

        System.out.println(system.getHighestGPAStudent());
        System.out.println(system.getLongestNameStudent());


    }
}
