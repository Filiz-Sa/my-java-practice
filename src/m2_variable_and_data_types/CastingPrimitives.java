package m2_variable_and_data_types;

public class CastingPrimitives {
    public static void main(String[] args) {
        byte b1=10;
        short sh1=b1;

        int n1=56;
        byte b2=(byte) n1;

        double price=433.44;
         int wholePrice=(int) price;

        System.out.println("price = " + price);
        System.out.println("wholePrice = " + wholePrice);

        int apple=544;
        double applesD=apple;
        System.out.println("apple = " + apple);
        System.out.println("applesD = " + applesD);


    }
}
