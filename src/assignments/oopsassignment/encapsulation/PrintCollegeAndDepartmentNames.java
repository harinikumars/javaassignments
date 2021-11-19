package assignments.oopsassignment.encapsulation;

import java.util.*;

public class PrintCollegeAndDepartmentNames {
    public static void main(String[] args) {

        Map<Object,Object> collegeDepartments = new HashMap<>();

        //Instantiating EncapsulationExample object to set college names
        EncapsulationExample college1 = new EncapsulationExample();
        college1.setCollegeName("College of Engineering - Guindy");

        EncapsulationExample college2 = new EncapsulationExample();
        college2.setCollegeName("Madras Institute of technology");

        EncapsulationExample college3 = new EncapsulationExample();
        college3.setCollegeName("GCT - Coimbatore");

        EncapsulationExample college4 = new EncapsulationExample();
        college4.setCollegeName("IISc Bangalore");

        EncapsulationExample college5 = new EncapsulationExample();
        college5.setCollegeName("PSG Coimbatore");

        // list of departments to be printed for all the colleges
        college1.setDepartmentNames(new ArrayList<String>(Arrays.asList("IT", "CSE", "EEE", "ECE", "Mechanical", "Civil", "Production", "Aeronautical")));
        college2.setDepartmentNames(new ArrayList<String>(Arrays.asList("IT", "CSE", "EEE", "ECE", "Mechanical", "Civil", "Aeronautical")));
        college3.setDepartmentNames(new ArrayList<String>(Arrays.asList("IT", "CSE", "EEE", "ECE", "Mechanical")));
        college4.setDepartmentNames(new ArrayList<String>(Arrays.asList("IT", "CSE", "EEE", "ECE", "Aeronautical")));
        college5.setDepartmentNames(new ArrayList<String>(Arrays.asList("IT", "CSE", "EEE", "ECE")));

        //input college name and the list of departments to the map
        collegeDepartments.put(college1.getCollegeName(),college1.getDepartmentNames());
        collegeDepartments.put(college2.getCollegeName(),college2.getDepartmentNames());
        collegeDepartments.put(college3.getCollegeName(),college3.getDepartmentNames());
        collegeDepartments.put(college4.getCollegeName(),college4.getDepartmentNames());
        collegeDepartments.put(college5.getCollegeName(),college5.getDepartmentNames());

        for(Map.Entry e : collegeDepartments.entrySet()){
            System.out.println("The college " +e.getKey()+ " has the below departments " +e.getValue());
        }
    }
}
