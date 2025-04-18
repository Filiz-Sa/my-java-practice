package m3_operators;

public class PrkingLot {
    public static void main(String[] args) {
        System.out.println("Welcome");

        int cars=0;

        System.out.println("2 cars parked");
        cars+=2;
        System.out.println("cars = " + cars);

        System.out.println("1 car parked");
        cars+=1;
        System.out.println("cars = " + cars);

        System.out.println("10 more cars parked");
        cars+=10;
        System.out.println("cars = " + cars);

        System.out.println("One car left");
        cars-=1;
        System.out.println("cars = " + cars);

        System.out.println("5 more cars left");
        cars-=5;
        System.out.println("cars = " + cars);

        System.out.println("3 times more cars parked");
        cars*=3;


        System.out.println("cars = " + cars);


    }
}
