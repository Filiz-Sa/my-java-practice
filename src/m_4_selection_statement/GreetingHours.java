package m_4_selection_statement;

public class GreetingHours {
    public static void main(String[] args) {
        int hour=22;
        if (hour>0 && hour<=24){
            if (hour>6 && hour<12){
                System.out.println("Good Morning");
            } else if (hour > 12 && hour<15  ) {
                System.out.println("Good Afternoon");
            } else  {
                System.out.println("Good Evening");
            }
        }else {
            System.out.println("This is not a valid hour");
        }
        
        
        
        
    }
}
