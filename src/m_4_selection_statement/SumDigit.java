package m_4_selection_statement;

public class SumDigit {
    public static void main(String[] args) {
        int num1=456;

        int firstDigit=num1%10;
        int secondDigit=num1%100/10;
        int thirdDigit=num1/100;

        System.out.println("Sum of digits= " +(firstDigit + secondDigit + thirdDigit));





    }
}
