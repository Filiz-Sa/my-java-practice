package m_4_selection_statement;

public class Calculator {
    public static void main(String[] args) {

        double n1=10, n2=20;
        char mathOperator='+';

        switch (mathOperator){
            case '-'-> System.out.println(n1-n2);
            case '+'-> System.out.println(n1+n2);
            case '*'-> System.out.println(n1*n2);
            case '/'-> System.out.println(n1/n2);
            default -> System.out.println("Invalid operator");
        }





    }
}
