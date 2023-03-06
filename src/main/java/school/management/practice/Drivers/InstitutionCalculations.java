package school.management.practice.Drivers;

// Here, we import any packages we need!
import school.management.practice.Models.*;

import java.io.IOException;
import java.util.logging.Logger;

public class InstitutionCalculations {
    //Any variables we want to initiate, we put up here!
    Institution institution;
    Student student;
    Teacher teacher;
    Logger logger;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public InstitutionCalculations(Logger logger) throws IOException {
        this.logger = logger;
    }
}
