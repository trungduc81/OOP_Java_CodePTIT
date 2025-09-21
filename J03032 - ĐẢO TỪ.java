import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0){
            String s =sc.nextLine() ; 
            String[] arr = s.trim().split("\\s+") ; 
            for(int i = 0 ; i < arr.length ; i++){
                StringBuilder sb = new StringBuilder(arr[i]) ; 
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println("");
        }
    }
}
