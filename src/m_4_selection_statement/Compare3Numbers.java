package m_4_selection_statement;
/*
num1=10 num2=55 num3=7
55 is biggest
 */
public class Compare3Numbers {
    public static void main(String[] args) {

        int num1=10;
        int num2=55;
        int num3=7;

        if (num1>num2 && num1>num3){
            System.out.println(num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }


    }
}
