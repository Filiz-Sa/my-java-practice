package m3_operators;
/*
TipOptions [variables, operators, concatenation]

    Declare and assign the following variables
        String food (list of all the food items),
        double item1Price, item2Price, item3Price
        double total (amount you owe) includes all item prices

    show the receipt of all the items and total cost of the bill
    then display 3 tip options and how much they would cost.
    show the tip for 10%, 18% and 25%
 */
public class TipOptions {
    public static void main(String[] args) {

        System.out.println("Thank you for your order");

        String foods="Cheese, spaghetti, orange juice";
        int item1Price=25;
        int item2Price=100;
        int item3Price=50;
        int totalPrice=item1Price + item2Price + item3Price;

        System.out.println("Your order costs $ " + totalPrice);
        System.out.println("%10 = " + (totalPrice*10/100));
        System.out.println("%18 = " + (totalPrice*18/100));
        System.out.println("%25 = " + (totalPrice*25/100));


    }
}
