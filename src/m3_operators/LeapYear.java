package m3_operators;

public class LeapYear {
    public static void main(String[] args) {
        int year=1900;
boolean divideFour=(year%4==0);
boolean divideHundred=(year%100!=0);
boolean divideFourHundred=(year%400==0);

boolean result=divideFour && divideFourHundred || divideHundred;

        System.out.println("Is " + year + " is leap year = " +result);



    }
}
