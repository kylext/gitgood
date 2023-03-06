package school.management.practice.Models;

import java.util.*;

public class Institution {
    List<Teacher> teachers;
    List<Student> students;
    Double grossEarnings;
    Double grossSpending;

    //Constructor for the institution class
    public Institution(List<Teacher> teachers, List<Student> students, Double grossEarnings, Double grossSpending){
        this.teachers = teachers;
        this.students = students;
        this.grossEarnings = grossEarnings;
        this.grossSpending = grossSpending;
    }

    //Getter and Setter Methods
    public List<Teacher> getTeachers() {
        return teachers;
    }
    //For both Teachers and Students, we will not be passing a list of objects,
    //but merely adding a teacher/student object to our list array of teachers/students
    //Consequently, we should update the setters to say "add" instead of set
    //(as the object we set is not intended to replace the entire list), and instead of passing List<objType> listVar
    // just pass a teacher/student type object
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
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
