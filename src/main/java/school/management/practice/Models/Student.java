package school.management.practice.Models;
import java.lang.*;
import java.util.Date;

/**
 * Started 3/6/2023
 *
 * Intent is to create a school management system (students, grades, teachers, etc.) to improve skills
 */
public class Student {
    //Want these to be private, so personal info can't be accessed by anyone
    private String id;
    private String name;
    private Double totalFees;
    private Double feesPaid;
    private Double grade;
    private Date enrollmentDate;
    private Date endEnrollmentDate;
    private Boolean enrollmentStatus;

    /**
     *
     * @param id alphanumeric school id assigned to student
     * @param name student name (First Last)
     * @param grade school grade
     */
    public Student(String id, String name, Double totalFees, Double feesPaid, Double grade, Date enrollmentDate, Date endEnrollmentDate, Boolean enrollmentStatus){
        this.id = id;
        this.name = name;
        this.totalFees = totalFees;
        this.feesPaid = feesPaid;
        this.grade = grade;
        this.enrollmentDate = enrollmentDate;
        this.endEnrollmentDate = endEnrollmentDate;
        this.enrollmentStatus = enrollmentStatus;
    }

    //Generate Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(Double totalFees) {
        this.totalFees = totalFees;
    }

    public Double getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(Double feesPaid) {
        this.feesPaid = feesPaid;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Date getEnrollmentDate() { return enrollmentDate; }

    public void setEnrollmentDate(Date enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    public Date getEndEnrollmentDate() { return endEnrollmentDate; }

    public void setEndEnrollmentDate(Date endEnrollmentDate) { this.endEnrollmentDate = endEnrollmentDate; }

    public Boolean getEnrollmentStatus() { return enrollmentStatus; }

    public void setEnrollmentStatus(Boolean enrollmentStatus) { this.enrollmentStatus = enrollmentStatus; }

    //We can set this to void (does not return a value) because we only want the variable feesPaid to be updated
    //When we call feesPaid it will reflect the updates
    public void updatePaidAmt(int fees) {
        feesPaid += fees;
    }


}
