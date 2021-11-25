package assignments.oopsassignment.inheritance;

public class Home {
    public void noOfLights(String roomName, int numberOfLights) {
        System.out.println("\nThe " + roomName + " has " + numberOfLights + " lights.\n");
    }

    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom();
        bedroom.noOfLights();

        GuestRoom guestRoom = new GuestRoom();
        guestRoom.noOfLights();

        LivingRoom livingRoom = new LivingRoom();
        livingRoom.welcomeMessage();
        livingRoom.noOfLights();

    }
}
