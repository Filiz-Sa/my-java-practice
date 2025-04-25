package m_4_selection_statement;

public class WeeklyWage {
    public static void main(String[] args) {

        int weeklyWage=900;
        int weeklyHours=45;
        double newWage;

        if(weeklyHours > 40){
           newWage= weeklyWage*1.5;
            System.out.println("newWage = $" + newWage);
        }else {
            System.out.println("weeklyWage = $" + weeklyWage);
        }




    }
}
