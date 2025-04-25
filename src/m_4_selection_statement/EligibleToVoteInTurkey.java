package m_4_selection_statement;

public class EligibleToVoteInTurkey {
    public static void main(String[] args) {

        int age=30;

        String citizenship="Turkey";

        if (citizenship=="Turkey"){
            if (age>=18){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("You are not eligible to vote");
            }
        }else System.out.println("You are not Turkish citizen.");






    }
}
