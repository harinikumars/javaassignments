package assignments.oopsassignment.inheritance;

public class LivingRoom extends Home{
    public static void main(String[] args) {
        LivingRoom.roomName="Living Room";
        LivingRoom.numberOfLights=5;
        LivingRoom.noOfLights();
    }
    //overriding the noOfLights method from the parent class
    static void noOfLights(){
        System.out.println("Number of lights in the " +LivingRoom.roomName+ " is : " +LivingRoom.numberOfLights);
    }
}
