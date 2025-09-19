import java.util.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int max = a[n-1]; 
        int idx = 0;
        boolean check = false ;
        for(int i = 1; i <= max; i++){
            if(idx < n && a[idx] == i){
                idx++; 
            }
            else {
                System.out.println(i); 
                check = true;
            }
        }
        if(!check){
            System.out.println("Excellent!");
        }
    }
}
