package assignments.oopsassignment.inheritance;

public class LivingRoom extends Home {

    void welcomeMessage() {
        System.out.println("\n Welcome to my home!\n");
    }

    //overriding the noOfLights method from the parent class
    public void noOfLights() {
        System.out.println("\n Number of lights in the Living Room is : 8");
    }
}
