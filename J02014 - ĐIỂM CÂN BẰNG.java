import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt() ; 
        while(t-- >0){
            int n = sc.nextInt() ; 
            int[] a = new int[n] ; 
            for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt() ; 
            int[] pre = new int[n] ; 
            pre[0] = a[0] ; 
            for(int i = 1 ; i < n ; i++){
                pre[i] = pre[i-1] + a[i] ; 
            }
            int check = 0 ; 
            for(int i = 1 ; i < n - 1 ; i++){
                if(pre[i-1] == pre[n-1] - pre[i]){
                    check = i+1 ; 
                    break ; 
                }
            }
            if(check==0){
                System.out.println("-1");
            }
            else System.out.println(check);
        }
    }
}
