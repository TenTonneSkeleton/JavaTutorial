package CodeWars.level8;

import com.sun.security.jgss.GSSUtil;

public class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        //          ((P-1)! + 1) / (P * P)
        double s = 1.0;
        if (n == -1.0 | n == 1.0) {
            return false;
        }
        for (int i = 1; i <= n - 1; i++) {
            s *= i;
            System.out.println(s);
        }
        s += 1;
        s = s / (n * n);
        int z = (int) s;
        s /= z;
        if (s == 1.0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        double n = 563;
        System.out.println(am_i_wilson(n));
    }
}


/* Variant 1
public class WilsonPrime {

    public static boolean am_i_wilson(long n) {
        long modulus = n * n;
        long product = 1;
        for (long factor = 2; factor < n; factor++)
            product = (product * factor) % modulus;
        return product + 1 == modulus;
    }

}
 */
