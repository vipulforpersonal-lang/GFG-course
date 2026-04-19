import java.util.Scanner;

public class travliingzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        // int fac = 1;
        int count = 0;

        int n = sc.nextInt();
        /*
         * for (int i = 2; i <= n; i++) {
         * fac = fac * i;
         * System.out.println(fac);
         * }
         * while (fac % 10 == 0) {
         * count++;
         * // fac = fac / 10;
         * }
         * System.out.println(fac);
         * System.out.println(count);
         */

        // APROOCH 2nd

        // aprooch two for finding the traling zero we find 5 multipule in any number
        // like : 1*2*3*4*5*6*
        // we use simple pattern : floor N/5+Floor N/25+ floor N/125 ...........
        // util n
        // not becoming zero and in denominetor 5 multiple only
        for (int i = 1; i <= n; i = i * 5) {
            count = count + n / i;
        }
        System.out.println(count);
    }

}
