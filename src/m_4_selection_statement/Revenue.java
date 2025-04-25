package m_4_selection_statement;

public class Revenue {
    public static void main(String[] args) {

        double price= 199.99;
        int quantity=10;
        double revenue=price*quantity;

        if(revenue>5000){
            double discount=revenue*10/100;
            System.out.println("Discount is= " + discount);
            System.out.println("Net revenue is = " + (revenue-discount));
        }else {
            System.out.println("Revenue is= " + revenue);
        }







    }
}
