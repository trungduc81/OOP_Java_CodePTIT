import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine(); 
        BigInteger m = new BigInteger(a), n = new BigInteger(b); 
        BigInteger res = m.subtract(n); 
        System.out.println(res);
    }
}
