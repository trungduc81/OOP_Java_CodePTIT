import java.util.* ; 
import java.math.* ; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            String x = sc.next() ; 
            String y = sc.next() ; 
            BigInteger num1 = new BigInteger(x) ; 
            BigInteger num2 = new BigInteger(y) ; 
            System.out.println(num1.add(num2));
        }
    }
}
