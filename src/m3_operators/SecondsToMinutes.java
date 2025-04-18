package m3_operators;
/*
SecondsToMinutes [variables, remainder operator, concatenation]
    Declare and assign the following variables
        totalSeconds

    Declare minutes , calculate minutes in totalSeconds
    Declare seconds , calculate remaining seconds
    Display in this format:
    In 550 seconds - there are 9 minutes and 10 seconds
 */
public class SecondsToMinutes {
    public static void main(String[] args) {


int seconds=550;
int minutes=seconds/60;
int remainder=seconds%60;

        System.out.println("In " + seconds + " seconds - there are " + minutes + " minutes and " + remainder + " seconds.");




    }
}
