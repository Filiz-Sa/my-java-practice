package m3_operators;

public class TotalPrice {
    public static void main(String[] args) {
        double price=20.5;
        int quantity=4;

        double totalPrice=price * quantity;
        System.out.println("totalPrice = " + totalPrice);

        //quess the result
        int x=2, y=3, z=9;

        y *= x +5;
        System.out.println(y);

        z %= y;
        System.out.println(z);

        z += 2.5;
        System.out.println(z);



    }
}
