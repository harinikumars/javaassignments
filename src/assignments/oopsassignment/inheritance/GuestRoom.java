package assignments.oopsassignment.inheritance;

public class GuestRoom extends Home {

    //overriding the noOfLights method from the parent class
     void noOfLights(){
        super.noOfLights("Guest Room",3);
    }
}
