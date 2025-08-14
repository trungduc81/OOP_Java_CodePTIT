import java.util.*;

public class NewClass {
    public static int MOD = (int) (1e9 + 7); 
    public static long binpow(long a , long b){
        if(b==0) return 1 ; 
        long x = binpow(a,b/2) ; 
        if(b%2==0) return (x * x) % MOD ; 
        else return ((x*x)%MOD)*a % MOD ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            while(true){
               long  a = sc.nextLong() , b = sc.nextLong() ; 
                if(a==0 && b==0) break ; 
                System.out.println(binpow(a,b));
            }
    }
}
