package m_4_selection_statement;

public class Score {
    public static void main(String[] args) {
        int score=90;

        if (score>0 && score<=100){
            if (score>=90){
                System.out.println("Passed with Distinction");
            } else if (score>=60 && score<90) {
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }
        }else {
            System.out.println("Invalid score");
        }



    }
}
