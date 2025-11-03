import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t  =sc.nextInt() ; 
        while(t-- > 0){
            String s = sc.next() ;   
            int k = sc.nextInt();   
            if (s.length() < 26) {
                System.out.println("NO");
                return;
            }
            HashSet<Character> se = new HashSet<>() ; 
            for(char c : s.toCharArray()) se.add(c) ; 
            if(26 - se.size() <= k) System.out.println("YES");
            else System.out.println("NO") ;  
        }
    }
}

