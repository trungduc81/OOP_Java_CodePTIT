import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; 
        int[] a = new int[n] ; 
        for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt() ; 
        for(int i = 0 ; i < n ; i++){
            int key = a[i] , j = i - 1 ; 
            while(j>=0 && a[j] > key){
                a[j+1] = a[j] ; 
                j-- ; 
            }
            a[j+1] = key ; 
            System.out.printf("Buoc %d: ",i) ; 
            for(int k = 0 ; k <= i ; k++){
                System.out.printf("%d ",a[k]) ; 
            }
            System.out.println("");
        }
    }
}
