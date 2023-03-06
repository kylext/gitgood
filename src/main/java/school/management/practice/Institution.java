package school.management.practice;

import java.util.*;

public class Institution {
    List<Teacher> teachers;
    List<Student> students;
    Double grossEarnings;
    Double grossSpending;

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

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> student) {
        this.students = student;
    }

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

    //Methods to add entries to the Teacher and Student array lists
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void addStudent(Student student){
        students.add(student);
    }
}
