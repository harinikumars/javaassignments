package assignments.oopsassignment.inheritance;

public class Home {
    static int numberOfLights;
    static String roomName;

    public static void main(String[] args) {
        numberOfLights=5;
        noOfLights();
    }
    static void noOfLights(){
        System.out.println("Number of lights in the Home is : " +numberOfLights);
    }
}
