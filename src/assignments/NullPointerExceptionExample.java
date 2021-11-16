package assignments;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Cannot determine the length of null");
        }
    }
}
