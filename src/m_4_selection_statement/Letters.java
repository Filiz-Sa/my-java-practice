package m_4_selection_statement;
/*
   CharCaseChecker
    ch = 'A'
    if ch is uppercase: "Uppercase letter"
        ch >= 'A' && ch <= 'Z'
    if ch is lowercase: "Lowercase letter"
    else: "Not a letter"
 */
public class Letters {
    public static void main(String[] args) {

        char ch='A';

        if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase letter");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Lowecase letter");
        }else {
            System.out.println("Invalid letter");
        }


    }
}
