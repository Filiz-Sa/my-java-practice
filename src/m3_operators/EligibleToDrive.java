package m3_operators;

public class EligibleToDrive {
    public static void main(String[] args) {
        double age=17;
        boolean learnersPermit=false;
        boolean haveDriversLicence=true;
        boolean result=((age>18 && haveDriversLicence) || (age>15 && learnersPermit));

        System.out.println("Is Mike eligible to drrive? " + result);




    }
}
