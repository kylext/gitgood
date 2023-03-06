package school.management.practice.Models;

import java.util.ArrayList;
import java.util.List;

//This class will check that the requested service is something our system was built for
public class checkRequestType {
    List<String> validRequest = new ArrayList<>();

    //TODO: Basic "requirements" are in the comments for data/methods to build out
    public checkRequestType(){
        //Here, we add the inputs we will accept from users
        //This could lead to filling out some questionnaire and being given a generated ID/temp password that gets replaced
        validRequest.add("New Student Account Setup");
        //Not sure what to do here, but maybe have them enter password to ensure that they understand what they are doing?
        //Also maybe 72 hr window where account is not actually deleted in case they change their mind?
        validRequest.add("Drop Out");
        //Simple scenario where they provide ID/pwd and their account balance is returned
        validRequest.add("Check Outstanding Fees");
        //This would be the initial setup process for a new hire where they are given and id
        validRequest.add("New Hire Account Setup");
        //This would retrieve salary info for an employee
        validRequest.add("Get Salary Information");
    }
}
