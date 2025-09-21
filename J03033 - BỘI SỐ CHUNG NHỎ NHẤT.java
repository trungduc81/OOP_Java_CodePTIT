import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0){
            BigInteger a = sc.nextBigInteger() , b = sc.nextBigInteger() ; 
            BigInteger ucln = a.gcd(b) ; 
            BigInteger bcnn = a.divide(ucln).multiply(b) ; 
            System.out.println(bcnn);
        }
    }
}
