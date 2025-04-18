package m3_operators;

public class Exercise {
    public static void main(String[] args) {

        char size='M';
        String color="blue";

        System.out.println(size=='M' && (color=="blue" || color=="tan"));

        boolean buy= size=='M' && (color=="blue" || color=="tan");

        System.out.println(size + " size, " + color + " color");
        System.out.println("buy= " +buy);

    }
}
