import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-->0){
            BigInteger a = sc.nextBigInteger() , b = sc.nextBigInteger() ; 
            if(a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)){
               System.out.println("YES");
            }
            else System.out.println("NO"); 
        }
    }
}
