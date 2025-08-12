import java.util.Scanner ; 

public class NewClass {
    public static int isprime(int n) { 
        if(n<2) return 0 ; 
        for(int i = 2 ; i*i <= n ; i++){
            if(n%i==0) return 0 ; 
        }
        return 1 ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            int a = sc.nextInt() ; 
            if(isprime(a)==1) System.out.println("YES"); 
            else System.out.println("NO");
        }
    }
}
