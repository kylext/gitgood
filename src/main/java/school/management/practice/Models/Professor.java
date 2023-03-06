package school.management.practice.Models;

//FUTURE IDEAS: user types "Add Professor", "Update Professor Salary" etc. in terminal/cmd line
//which then filters to the necessary action (upsert)


public class Professor {
    private String id;
    private String name;
    private Double salary;

    public Professor(String id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
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
}
