package m3_operators;

public class SwapTwoNumbers {
    public static void main(String[] args) {
//use temporary variable
        int num1=10;
        int num2=15;
        int temp;

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //not use temporary variable.I will use operators

        int num3=10;
        int num4=15;

        num4=num3 + num4;  // num3=10  num4=25
        num3=num4 - num3;  //num3=15  num4=25;
        num4=num4 -num3;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);




    }
}
