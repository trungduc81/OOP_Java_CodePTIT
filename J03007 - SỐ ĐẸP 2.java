import java.util.*;

public class NewClass {
    public static boolean check(String s){
        int l = 0 , r = s.length() - 1 ; 
        if(s.charAt(l) != '8' || s.charAt(r) != '8') return false ; 
        int sum = 0 ; 
        while(l<=r){
            int left = s.charAt(l) - '0' ; 
            int right =s.charAt(r) - '0' ; 
            if(l==r){
                sum += left ; 
            }
            else {
                sum += left ; 
                sum += right ; 
            }
            if( left != right)
                return false ; 
            l++ ; 
            r-- ; 
        }
        return sum%10 == 0 ; 
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
