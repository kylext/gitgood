package school.management.practice.Models;

import java.util.Date;

public class Professor {
    private String id;
    private String name;
    private Double salary;
    private Date hireDate;
    private Date employmentEndDate;
    private Boolean employmentStatus;

    public Professor(String id, String name, Double salary, Date hireDate, Date employmentEndDate, Boolean employmentStatus){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.employmentEndDate = employmentEndDate;
        this.employmentStatus = employmentStatus;
    }

    //Getters and Setters
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHireDate() { return hireDate; }

    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public Date getEmploymentEndDate() { return employmentEndDate; }

    public void setEmploymentEndDate(Date employmentEndDate) { this.employmentEndDate = employmentEndDate; }

    public Boolean getEmploymentStatus() { return employmentStatus; }

    public void setEmploymentStatus(Boolean employmentStatus) { this.employmentStatus = employmentStatus; }
}
