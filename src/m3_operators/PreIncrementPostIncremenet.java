package m3_operators;

public class PreIncrementPostIncremenet {
    public static void main(String[] args) {
        int x=10;
        int y=22;

        System.out.println(x++ + x);
        System.out.println(x++ + ++y); // 11+23
        System.out.println(++x % 5);

        int x1=2;
        int y1=x1++;
        System.out.println(y1);

        int x3=2;
        System.out.println(--x3);

        int x4=2;
        System.out.println(x4++);

        int a=2;
        System.out.println(--a);

        int b=8;
        int c=b--;
        System.out.println(c);

        int z=10;
        z=--z + z++ + z-- + z++; // 9 + 9 + 10 +9
        System.out.println(z);

        int d=4;
        int e=--d * 4 - d++; //3 * 4 - 3
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        int f=1;
        f= f++ + f++ / --f * --f; //1 +2 / 2 * 1
        System.out.println(f);


    }
}
