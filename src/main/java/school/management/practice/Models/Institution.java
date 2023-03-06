package school.management.practice.Models;

import java.util.*;

public class Institution {
    List<Professor> professors;
    List<Student> students;
    Double grossEarnings;
    Double grossSpending;

    //Constructor for the institution class
    public Institution(List<Professor> professors, List<Student> students, Double grossEarnings, Double grossSpending){
        this.professors = professors;
        this.students = students;
        this.grossEarnings = grossEarnings;
        this.grossSpending = grossSpending;
    }

    //Getter and Setter Methods
    public List<Professor> getProfessor() {
        return professors;
    }
    //For both Professor and Students, we will not be passing a list of objects,
    //but merely adding a Professor/student object to our list array of Professor/students
    //Consequently, we should update the setters to say "add" instead of set
    //(as the object we set is not intended to replace the entire list), and instead of passing List<objType> listVar
    // just pass a Professor/student type object
    public void addProfessors(Professor professor) {
        professors.add(professor);
    }

    public List<Student> getStudents() {
        return students;
    }
    //See comment above for addTeachers
    public void addStudents(Student student) { students.add(student); }

    public Double getGrossEarnings() {
        return grossEarnings;
    }

    public void setGrossEarnings(Double grossEarnings) {
        this.grossEarnings = grossEarnings;
    }

    public Double getGrossSpending() {
        return grossSpending;
    }

    public void setGrossSpending(Double grossSpending) {
        this.grossSpending = grossSpending;
    }
}
