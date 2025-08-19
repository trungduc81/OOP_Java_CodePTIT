import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; 
        int[] a = new int[n] ; 
        for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt() ; 
        for(int i = 0 ; i < n - 1 ; i++){
            System.out.printf("Buoc %d: ",i+1);
            for(int j = i+1 ; j < n ; j++){
                if(a[i] > a[j]){
                    int tmp = a[i] ; 
                    a[i] = a[j] ; 
                    a[j] = tmp ; 
                } 
            }
            for(int k = 0 ; k < n ; k++){
                System.out.printf("%d ",a[k]) ;
            }
            System.out.printf("\n");
        }
    }
}
