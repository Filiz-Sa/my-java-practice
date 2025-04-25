package m_4_selection_statement;

public class AgeGroup {
    public static void main(String[] args) {

        int age=42;

        if (age>0 && age<150){
            if (age>=0 && age<=21){
                System.out.println("Teenager");
            } else if (age>=21 && age<=55) {
                System.out.println("Adult");
            } else if (age>=55) {
                System.out.println("Senior");
            }else {
                System.out.println("Invalid age");
            }
        }








    }
}
