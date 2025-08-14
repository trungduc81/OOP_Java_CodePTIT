import java.util.*;

public class NewClass {
    static long max_prime(long n) {
        long max_prime = -1 ;
        while (n % 2 == 0) {
            max_prime = 2 ; 
            n /= 2 ; 
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                max_prime = i ;
                n /= i;
            }
        }
        if (n > 1) max_prime = n ;
        return max_prime ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(max_prime(n));
        }
    }
}
