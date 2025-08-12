import java.util.Scanner ; 

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            int n =sc.nextInt() ; 
            long sum = (long) (n+1)*n/2 ; 
            System.out.println(sum) ;

        }
    }
}
