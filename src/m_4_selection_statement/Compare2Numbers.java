package m_4_selection_statement;
/*
a and b
if a is greater b: "a is greater"
if b is greater than a : "b is greater"
otherwise : "they are equal"

 */
public class Compare2Numbers {
    public static void main(String[] args) {
        int a=35;
        int b=76;

        if(a>b){
            System.out.println(a + " is greater");
        } else if (a<b) {
            System.out.println( b + " is greater");
        }else {
            System.out.println("They are equal");
        }


    }
}
