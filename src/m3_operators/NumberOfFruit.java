package m3_operators;

public class NumberOfFruit {
    public static void main(String[] args) {
        int applesCount=2;
        int orangesCount=3;
        int pearsCount=4;

        boolean result=(applesCount <orangesCount || orangesCount>=pearsCount);
        System.out.println("result = " + result);

        //other one
        int applesCount1=5;
        int orangesCount1=3;
        int pearsCount1=4;
        boolean result1 =(applesCount1 <orangesCount1 || orangesCount1>=pearsCount1);
        System.out.println("result = " + result1);




    }
}
