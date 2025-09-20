import java.util.*;

public class NewClass {
    public static boolean check(String s){
        int l = 0 , r = s.length() - 1 ; 
        while(l<=r){
            int left = s.charAt(l) - '0' ; 
            int right =s.charAt(r) - '0' ; 
            if(left%2 != 0 || right%2 != 0 || left != right)
                return false ; 
            l++ ; 
            r-- ; 
        }
        return true ; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0){
            String s = sc.nextLine() ; 
           if(check(s)) System.out.println("YES");
           else System.out.println("NO");
        }
    }
}
