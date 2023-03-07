package school.management.practice.Drivers;

// Here, we import any packages we need
import school.management.practice.Models.*;
import school.management.practice.PromptUserRequest;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InstitutionDriver {

    //Any variables we want to initiate, we put up here!
    Institution institution;
    Student student;
    Professor professor;
    Logger logger;
    List<Professor> professors;
    List<Student> students;
    PromptUserRequest promptUserRequest;

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public InstitutionDriver(Logger logger) throws IOException {
        this.logger = logger;
    }

    public void addProfessors(Professor professor) {
        professors.add(professor);
    }
    public void addStudents(Student student) {
        students.add(student);
    }

    //Below here we can add methods
    public void requestType(){
        //Prompt them for why they are using the system
        System.out.println("Hello, thank you for using our service. ");
    }

}
