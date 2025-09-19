import java.util.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; 
        int[][] a = new int[n][n] ; 
        for(int i = 1 ; i <= n ; i++){
            System.out.printf("List(%d) = ",i);
            for(int j = 1 ; j <= n ; j++){
                a[i-1][j-1] = sc.nextInt() ;
                if(a[i-1][j-1]==1) System.out.print(j + " ");
            }
            System.out.println("");
        }      
    }
}
