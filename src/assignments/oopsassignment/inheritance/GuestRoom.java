package assignments.oopsassignment.inheritance;

public class GuestRoom extends Home {
    public static void main(String[] args) {
        GuestRoom.roomName="Guest Room";
        GuestRoom.numberOfLights=6;
        GuestRoom.noOfLights();
    }
    //overriding the noOfLights method from the parent class
    static void noOfLights(){
        System.out.println(GuestRoom.numberOfLights+ " lights are there in the " +GuestRoom.roomName+ ".");
    }
}
