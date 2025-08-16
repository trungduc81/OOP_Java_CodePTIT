import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt() , x ; 
        int[] a = new int[1005] ; 
        int[] b = new int[1005] ;  
        for(int i = 0 ; i < n ; i++){
            x = sc.nextInt() ; 
            a[x] = 1 ; 
        }
        for(int i = 0 ; i < m ; i++){
            x = sc.nextInt() ; 
            b[x] = 1 ;  
        }
        for(int i = 0 ; i < 1005 ; i++){
            if(a[i]==1 && b[i]==1) System.out.print(i+" ") ; 
        }  
    } 
}
