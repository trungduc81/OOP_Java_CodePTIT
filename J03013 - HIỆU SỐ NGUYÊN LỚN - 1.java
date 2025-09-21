import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine() ; 
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger() , b =sc.nextBigInteger() ; 
            BigInteger res = a.subtract(b).abs() ; 
            int len = Math.max(a.toString().length() , b.toString().length()) ; 
            while(len > res.toString().length()){
                System.out.print("0");
                len-- ; 
            }
            System.out.println(res);
        }
    }
}
