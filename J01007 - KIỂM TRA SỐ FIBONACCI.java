import java.util.Scanner ; 

public class NewClass {
    public static void fi(long[] fibo){
        fibo[0] = 0 ; fibo[1] = 1 ; 
        for(int i =2 ; i < 92 ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2] ; 
        }
    }
    public static void main(String[] args) {
        long[] fibo = new long[92] ; 
        fi(fibo) ; 
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            long n = sc.nextLong() ; 
            int check = 0 ; 
            for(int i = 0 ; i < 92 ; i++){
                if(fibo[i]==n){
                    check = 1 ; 
                    break ; 
                }
            }
            if(check==0) System.out.println("NO"); 
            else System.out.println("YES");
        }
    }
}
