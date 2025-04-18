package m3_operators;

public class LogicalAndBitwiseOperator {
    public static void main(String[] args) {

        int b=2;

        boolean result=(++b == 2 || b==2) && --b==2;

        System.out.println("result = " + result);
        System.out.println("b = " + b);


        boolean b1=true, b2=true;
        int y=20;
        b1=(y !=10) || (b2 = false);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        double m=20;
        double n=80;
     double addition=m+n;
        System.out.println(addition);
     double multiplication=addition*25;
        System.out.println(multiplication);
     double remainder=multiplication%40;
        System.out.println(remainder);


     boolean result1=remainder<=20;
        System.out.println(result1);





    }
}
