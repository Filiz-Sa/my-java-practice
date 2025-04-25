package m_4_selection_statement;

public class MadianNumber {
    public static void main(String[] args) {

        int a=10, b=15, c=20;

        boolean aIsMadian=(a>b && a<c) || (a>c && a<b);
        boolean bIsMadian=(b>a && b<c) || (b>c && b<a);

        if (aIsMadian){
            System.out.println(a + " is median number");
        } else if (bIsMadian) {
            System.out.println(b + " is median number");
        }else {
            System.out.println(c + " is median number");
        }


    }
}
