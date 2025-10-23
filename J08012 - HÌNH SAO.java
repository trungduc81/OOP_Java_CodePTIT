package luyentap;
import java.util.* ;
import java.io.* ; 

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] deg = new int[n+1] ; 
        for(int i = 1 ; i < n ; i++){
            int u = sc.nextInt() , v = sc.nextInt() ; 
            deg[u]++ ; 
            deg[v]++ ; 
        }
        for(int i = 1 ; i <= n ; i++){
            if(deg[i]==n-1){
                System.out.println("Yes");
                return ; 
            }
        }
        System.out.println("No");
    }
}
