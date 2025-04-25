package m_4_selection_statement;

public class PrintNumber {
    public static void main(String[] args) {
    int number=123;

    int firstDigit=number%10;
    int secondDigit=number/10%10;
    int thirdDigit=number/100;

      switch (thirdDigit){
          case 1 -> System.out.print("yüz");
          case 2 -> System.out.print("iki yüz");
          case 3 -> System.out.print("üç yüz");

      }
      switch (secondDigit){
          case 1-> System.out.print("on");
          case 2-> System.out.print("yirmi");
          case 3-> System.out.print("otuz");
      }
      switch (firstDigit){
          case 1-> System.out.print("bir");
          case 2-> System.out.print("iki");
          case 3-> System.out.print("üç");
      }








    }
}
