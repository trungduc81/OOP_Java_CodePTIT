import java.util.*;
import java.math.*;

public class NewClass {
    public static boolean check(String s){
        int l = 0 , r = s.length() - 1 ; 
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)) 
                return false ; 
        l++ ; 
        r-- ; 
        }
        return true ; 
    }
    public static String cv(String s){
        String tmp = "" ; 
        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i) ; 
            if('A' <= c && c <= 'C') tmp += '2' ; 
            else if ('D' <= c && c <= 'F') tmp += '3' ;
            else if ('G' <= c && c <= 'I') tmp += '4' ;
            else if ('J' <= c && c <= 'L') tmp += '5' ;
            else if ('M' <= c && c <= 'O') tmp += '6' ;
            else if ('P' <= c && c <= 'S') tmp += '7' ;
            else if ('T' <= c && c <= 'V') tmp += '8' ;
            else if ('W' <= c && c <= 'Z') tmp += '9' ;
        }
        return tmp ; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-->0){
            String s = sc.next() ; 
            s = s.toUpperCase(); 
            String tmp = cv(s) ; 
            if(check(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
