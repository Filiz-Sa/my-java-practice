package m_4_selection_statement;

public class Grade {
    public static void main(String[] args) {
int math=50;
int chemistry=60;
int biology=70;
int everage=(math+chemistry+biology)/3;

if (everage>0 && everage<=100){
    if (everage>90 && everage<=100){
        System.out.println("Avarage is " + everage);
        System.out.println("Grade is A");
    } else if (everage>80 && everage<=90) {
        System.out.println("Avarage is " + everage);
        System.out.println("Grade is B");
    } else if (everage>70 && everage<=80) {
        System.out.println("Avarage is " + everage);
        System.out.println("Grade is C");
    } else if (everage>60 && everage<=70) {
        System.out.println("Avarage is " + everage);
        System.out.println("Grade is D");
    }else {
        System.out.println("Avarage is " + everage);
        System.out.println("Grade is F");
    }
    }else {
    System.out.println("Invalid Number");
    }

    }
}
