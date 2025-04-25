package m_4_selection_statement;

public class LaptopModels {
    public static void main(String[] args) {
        String laptopModel="dell";

        switch (laptopModel){
            case "apple":
                System.out.println("Apple-no virüs");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "acer":
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy that one!");

        }






    }
}
