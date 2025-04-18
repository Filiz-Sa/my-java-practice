package m3_operators;
/*
GiftCard
    declare and assign a gift card with 200.0
    declare and assign String variable items and assign ""
    buy 2 items.
    buy item 1 for x price and subtract from your gift card,
        also add item name to items
    buy item 2 for x price and subtract from your gift card,
        also add item name to items
    print the remaining balance of your gift card and all items
 */
public class GiftCard {
    public static void main(String[] args) {


        double giftCard=200.0;
        String items;

        System.out.println("Buying pants for 50$");
        String item1="pants";
        int item1Price=50;
        double remainder=giftCard-item1Price;

        System.out.println("Buying shooes for 125$");
        String item2="shooes";
        int item2Price=125;
        double remainder2=remainder-item2Price;

        double totalRemainder=giftCard-(item1Price+item2Price);

        System.out.println("totalRemainder = " + totalRemainder+ "$");


    }
}
