package assignments.oopsassignment.inheritance;

public class Bedroom extends Home{
    public static void main(String[] args) {
        Bedroom.roomName="Bedroom";
        Bedroom.numberOfLights=3;
        Bedroom.noOfLights();
    }
    //overriding the noOfLights method from the parent class
    static void noOfLights(){
        System.out.println("The " +Bedroom.roomName+ " has " +Bedroom.numberOfLights+ " lights.");
    }
}
