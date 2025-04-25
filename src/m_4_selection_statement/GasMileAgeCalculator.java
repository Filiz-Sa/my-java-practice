package m_4_selection_statement;
/*
    current, previous, gallons,
    calculate and assign to gasMileage
    if gasMileage more than= 25 -> good gas mileage
    otherwise poor gas mileage
 */
public class GasMileAgeCalculator {
    public static void main(String[] args) {

        int current=50655;
        int previous=50_000;
        int gallons=30;

        int mpg=(current-previous)/gallons;

        if (mpg > 25){
            System.out.println("Good gas mileage");
        }else {
            System.out.println("Poor gas mileage");
        }






    }
}
