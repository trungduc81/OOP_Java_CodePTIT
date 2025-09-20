import java.util.*;

public class NewClass {
    public static boolean check(String s){
        int l = 0 , r = s.length() - 1 ; 
        for(int i = 0 ; i < s.length() ; i++){
            int tmp = s.charAt(i) - '0' ; 
            if(tmp != 2 && tmp != 3 && tmp != 7 && tmp != 5)
                return false ; 
        }
        while(l<=r){
            int left = s.charAt(l) - '0' ; 
            int right =s.charAt(r) - '0' ; 
            if( left != right)
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
