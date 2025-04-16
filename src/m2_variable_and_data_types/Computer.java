package m2_variable_and_data_types;

public class Computer {
    public static void main(String[] args) {

        String model="LG - gram 16\" Laptop";
        String cpu="Intel Evo 13th Gen Intel Core i7-1360P";
        int ram=16;
        String stroge="1TB SSD";
        double price=845.99;
        boolean onSale=true;

        System.out.println(model + " - " + cpu  +" - " + ram + "GB RAM - " + stroge + "\n$" + price);
        System.out.println("Saving = " + onSale);

        //another laptop
        String model1="HP - Victus 15.6\" Full HD 144Hz Gaming Laptop";
        String cpu1= "Intel Core i7";
        int ram1=16;
        String storage1="512GB SSD";
        double price1=1099.99;
        boolean onSale1=false;

        System.out.println("=====================");
        System.out.println(model1 + " - " + cpu1 + " - " + ram1 + "GB RAM" +" - " + storage1 + "\n$" +price1 );
        System.out.println("onSale1 = " + onSale1);


    }
}
