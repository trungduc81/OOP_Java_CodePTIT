import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            long n =sc.nextLong() ; 
            int check = 0 ; 
            while(n>=10){
                long a = n % 10 ; 
                long b = n/10 % 10 ; 
                if(Math.abs(a-b) != 1) {
                    check = 1 ; 
                    break ; 
                }
                n/=10 ; 
            }
            if(check==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
