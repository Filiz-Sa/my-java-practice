package m_4_selection_statement;

public class Ternary {
    public static void main(String[] args) {
        int num=3;

        String result=(num<0)? "Number is negative" : "Number is positive";

        System.out.println(result);
        System.out.println("-------------------------");

        int year=2005;
        int age=2025-year;

        String result2=(age > 18 ) ? "You are eligible to vote" : "You are not eligible to vote";

        System.out.println(result2);

        System.out.println("------------------------------");

        int number=3;

        String result3=(number>0) ? "Number is positive" :
                (number<0) ? "Number is negative" : "Number is zero";

        System.out.println(result3);







    }














}
