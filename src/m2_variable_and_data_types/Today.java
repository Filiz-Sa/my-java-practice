package m2_variable_and_data_types;

public class Today {
    public static void main(String[] args) {

        int year=2025;
        String  month="January";
        int day=26;
        String weekDay="Sunday";
        var hour=2;
        var minute=47;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("weekDay = " + weekDay);
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
//  Sunday, January 26, 2025 - 2:47 PM EST

        System.out.println(weekDay + ", " + month + day + ", " + year + " - " +hour + ":" + minute + " PM EST");


    }
}
