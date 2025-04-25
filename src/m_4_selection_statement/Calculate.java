package m_4_selection_statement;

public class Calculate {
    public static void main(String[] args) {
        char chr='+';
        int num1=2;
        int num2=3;

        switch (chr){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }

}
