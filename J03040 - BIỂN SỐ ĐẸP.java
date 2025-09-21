import java.util.*;
import java.math.*;

public class NewClass {
    public static boolean check1(String s){
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) >= s.charAt(i+1))
                return false ; 
        }
        return true ; 
    }
    public static boolean check2(String s){
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) != s.charAt(i+1))
                return false ; 
        }
        return true ; 
    }
    public static boolean check3(String s){
        if(s.charAt(0) != s.charAt(1) || s.charAt(1) != s.charAt(2))
            return false ; 
        if(s.charAt(3) != s.charAt(4))
            return false ; 
        return true ; 
    }
    public static boolean check4(String s){
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8')
                return false ; 
        }
        return true ; 
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-->0){
             String s = sc.next() ; 
             String tmp = s.substring(5,8) + s.substring(9,11) ; 
             if(check1(tmp) || check2(tmp) || check3(tmp) || check4(tmp)){
                 System.out.println("YES");
             }
             else System.out.println("NO");
        }
    }
}
