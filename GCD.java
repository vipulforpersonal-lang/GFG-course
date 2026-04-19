
import java.util.Scanner;

class GCD1 {
    int res1;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    public void gcd() {
        int res1 = Math.min(a, b);
        while (res1 > 0) {
            if (a % res1 == 0 && b % res1 == 0) {
                System.out.println(res1);
                break;

            }

        }

    }
}

public class GCD {
    public static void main(String[] args) {
        System.out.println("enter 2 number ");
        Scanner sc = new Scanner(System.in);
        GCD1 GD = new GCD1();
        GD.gcd();
        System.out.println(GD.res1);

    }

}
