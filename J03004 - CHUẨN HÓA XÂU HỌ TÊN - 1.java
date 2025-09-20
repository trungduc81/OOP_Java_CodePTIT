import java.util.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0){
            String s = sc.nextLine() ; 
            s = s.toLowerCase() ; 
            String[] arr = s.trim().split("\\s+") ; 
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) ; 
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
    }
}
