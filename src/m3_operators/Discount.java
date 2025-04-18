package m3_operators;

public class Discount {
    public static void main(String[] args) {

        int regularPrice=100;
        int discountRate=20;
        double discountAmount=regularPrice * discountRate / 100;
        double salesPrice=regularPrice-discountAmount;

        System.out.println("Regular Price: $" + regularPrice);
        System.out.println("Discount Amount: $" +discountAmount);
        System.out.println("Sale Price: $" + salesPrice);
    }
}
