import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        int T = 1; 
        while(t-- > 0){
            int n = sc.nextInt(); 
            int[] a = new int[n]; 
            int[] cnt = new int[10005]; 
            
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt(); 
                cnt[a[i]]++; 
            }

            System.out.printf("Test %d:\n", T);
            for(int i = 0; i < n; i++){
                if(cnt[a[i]] > 0){
                    System.out.printf("%d xuat hien %d lan\n", a[i], cnt[a[i]]);
                    cnt[a[i]] = 0; 
                }
            }
            T++; 
        }
    } 
}
