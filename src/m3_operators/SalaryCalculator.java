package m3_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate=50;
        int weeklyHours=45;
        double stateTaxRate=6;
        double federalTaxRate=26;

        double grossPay=hourlyRate* weeklyHours*52;
        double stateTax=grossPay*stateTaxRate/100;
        double federalTax=grossPay*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double netIncome=grossPay-totalTax;

        System.out.println("Gross pay is: $" +grossPay);
        System.out.println("Fedaral tax is: $" + federalTax);
        System.out.println("State tax is: $ " + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $ " + netIncome);



    }
}
