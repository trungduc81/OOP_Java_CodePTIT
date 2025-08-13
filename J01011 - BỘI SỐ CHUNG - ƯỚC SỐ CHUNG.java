import java.util.Scanner;

public class NewClass {
    public static long gcd(long a , long b){
        if(b==0) return a ; 
        else return gcd(b,a%b) ; 
    }

    public static long lcm(long a , long b){
        return a/gcd(a,b)*b ; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-- > 0){
            long a = sc.nextLong() , b = sc.nextLong() ; 
            System.out.println(lcm(a,b) + " " + gcd(a,b)) ;
        }
    }
}
