package m_4_selection_statement;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int total=75;

        switch (total){
            case 50 -> System.out.println("20 crew, 30 passengers");
            case 75 -> System.out.println("25 crew, 50 passengers");
            case 100-> System.out.println("30 crew, 70 passengers");
            default -> System.out.println("Invalid number of people");




        }











    }
}
