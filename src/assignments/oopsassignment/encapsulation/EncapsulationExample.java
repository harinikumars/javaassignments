package assignments.oopsassignment.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationExample {
    private String collegeName;
    private List<String> departmentNames = new ArrayList<>();

   public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    public String getCollegeName(){
        return collegeName;
    }

    public void setDepartmentNames(List<String> departmentNames) {
            this.departmentNames.addAll(departmentNames);
    }
    public String getDepartmentNames(){
        String listOfDepartments = "\n";
        for(String s : departmentNames){
            listOfDepartments = listOfDepartments + s + "\n";
        }
        return listOfDepartments;
    }
}
