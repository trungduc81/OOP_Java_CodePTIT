import java.util.*;

public class NewClass {
    static int n, k , cnt = 0 ;
    static int[] x ; 
    public static void Try(int i){
        for(int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                for(int m = 1; m <= k; m++){
                    System.out.print(x[m]);
                }
                cnt++ ; 
                System.out.print(" ");
            } else{
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        x = new int[k+1]; 
        x[0] = 0;           
        Try(1);
        System.out.println("");
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
