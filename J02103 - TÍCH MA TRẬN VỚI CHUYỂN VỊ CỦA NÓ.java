import java.util.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        for(int test = 1 ; test <= t ; test++){
            int n = sc.nextInt() ; 
            int m =sc.nextInt() ; 
            int[][] a = new int[n][m] ; 
            int[][] b = new int[m][n] ; 
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    a[i][j] = b[j][i] = sc.nextInt() ; 
                }
            }
            int[][] res = new int[n][n] ; 
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    for(int k = 0 ; k < m ; k++){
                        res[i][j] += a[i][k] * b[k][j] ; 
                    }
                }
            }
            System.out.println("Test " + test + ":" );
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println("");
            }
        }
              
    }
}
