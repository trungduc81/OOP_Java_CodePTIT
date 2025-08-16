import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-- > 0){
            int n = sc.nextInt() ; 
            int check = 0 ; 
            while(n>0){
                int m = n % 10 ; 
                if(m != 1 && m != 2 && m != 0){
                    check = 1 ; 
                    break ; 
                }
                n /= 10 ; 
            }
            if(check==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
