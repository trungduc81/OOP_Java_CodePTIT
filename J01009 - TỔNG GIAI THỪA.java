import java.util.Scanner;

public class NewClass {
    public static long fact(int n){
        long sum = 1 ; 
        for(int i = 2 ; i <= n ; i++) sum *= i ; 
        return sum ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0 ; 
        for(int i = 1 ; i <= n ; i++){
            res += fact(i) ; 
        }
        System.out.println(res) ;
    }
}
