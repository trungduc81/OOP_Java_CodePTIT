import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger() , b = sc.nextBigInteger() ; 
            System.out.println(b.gcd(a));           
        }
    }
}
