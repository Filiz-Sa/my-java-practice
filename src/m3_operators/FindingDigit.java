package m3_operators;
/*
Find the last 4 digit of SSN and print them(ignore sashes).
SSN=078-05-1120

 */
public class FindingDigit {
    public static void main(String[] args) {

        int number=78051120;

        int lastForDigit=number%10000;

        System.out.println("lastForDigit = " + lastForDigit);


    }
}
