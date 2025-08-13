import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-- > 0){
            int n =sc.nextInt() ; 
            int cnt = 0 ; 
            int i = 1 ; 
            while(i*i < n){
                if(n%i==0){
                    if(i%2==0) cnt++ ; 
                    if(n/i % 2 ==0) cnt++ ; 
                }
                i++ ; 
            }
            if(i*i==n && i%2==0) cnt++ ; 
            System.out.println(cnt);
        }
    }
}
