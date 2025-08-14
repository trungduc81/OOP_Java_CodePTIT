import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        long n = sc.nextLong() ; 
        int cnt = 0 ; 
        while(n>0){
            long m = n % 10 ; 
            if(m==4 || m==7) cnt++ ; 
            n /= 10 ; 
        }
        if(cnt==4 || cnt==7) System.out.println("YES"); 
        else System.out.println("NO");
    }
}
