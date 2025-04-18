package m3_operators;

public class EligibleForWork {
    public static void main(String[] args) {

        int year=1985;
        int age=2025-year;

        boolean isEligibleForWork=(age >= 18 && age <=65);
        System.out.println("Am I eligible to work? " +isEligibleForWork);




    }
}
