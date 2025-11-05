import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.* ; 

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in")) ; 
        String s = sc.nextLine() ; 
        while(s.length() > 1){
            int n = s.length() ; 
            BigInteger num1 = new BigInteger(s.substring(0,n/2)) ;
            BigInteger num2 = new BigInteger(s.substring(n/2)) ; 
            BigInteger sum = num1.add(num2) ; 
            s = sum.toString() ; 
            System.out.println(s);
        }
    }
}
