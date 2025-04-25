package m_4_selection_statement;

public class OxygenTank {
    public static void main(String[] args) {
int oxygenLevel=75;

if (oxygenLevel>=90){
    System.out.println("Your tank is full");
} else if (oxygenLevel>=80) {
    System.out.println("Still okay");
} else if (oxygenLevel>=70) {
    System.out.println("Don't  go too far");
} else if (oxygenLevel>=60) {
    System.out.println("Start to head back");
}else {
    System.out.println("Be careful, you are at %50");
}


    }
}
