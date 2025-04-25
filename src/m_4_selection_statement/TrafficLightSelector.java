package m_4_selection_statement;

public class TrafficLightSelector {
    public static void main(String[] args) {

        char color='R';

        switch (color){
            case 'r','R':
                System.out.println("Red");
                break;
            case 'y','Y':
                    System.out.println("Yellow");
                    break;
            case 'g','G':
                        System.out.println("Green");
                        break;
            default:
                System.out.println("Invalid color");
        }




    }
}
