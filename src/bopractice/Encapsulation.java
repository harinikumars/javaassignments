package bopractice;

class Encapsulation {
    private int a;

    public int getA() {
        return a;
    }
    public void setA(int a){
        this.a=a;
    }
}
class EncapsulationExercise{
    public static void main(String[] args) {
        Encapsulation enc = new Encapsulation();
        enc.setA(2);
        System.out.println("The value is : " +enc.getA());
    }
}
