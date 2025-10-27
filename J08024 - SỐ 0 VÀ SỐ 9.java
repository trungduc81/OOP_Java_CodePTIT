import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(true){
               String s = q.poll();
               BigInteger num = new BigInteger(s);
               if(num.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)){
                   System.out.println(s);
                   break;
                }
                q.add(s + "0");
                q.add(s + "9");
            }
        }
    }
}
