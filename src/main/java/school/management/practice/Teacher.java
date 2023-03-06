package school.management.practice;

//FUTURE IDEAS: user types "Add Teacher", "Update Teacher Salary" etc. in terminal/cmd line
//which then filters to the necessary action (upsert)


public class Teacher {
    private String id;
    private String name;
    private Double salary;

    public Teacher(String id, String name, Double salary){
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
