import java.util.*;
import java.math.*;

public class NewClass {
    public static boolean check(String s){
        if (s.charAt(0) == '0') return false ; 
        for(int i = 0 ; i < s.length() ; i++){
            if(!Character.isDigit(s.charAt(i))) 
                return false ; 
        }
        return true ; 
    }
    public static boolean uuthe(String s){
        int even = 0 , odd = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            int tmp =s.charAt(i) -'0' ; 
            if(tmp%2==0) even++ ; 
            else odd++ ; 
        }
        return (s.length()%2==0 && even > odd) || (s.length()%2 != 0 && odd > even) ; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-->0){
            String s = sc.next() ; 
            if(!check(s)) System.out.println("INVALID");
            else {
                if(uuthe(s)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
