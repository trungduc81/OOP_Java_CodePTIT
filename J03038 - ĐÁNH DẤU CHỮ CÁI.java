import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next() ; 
        Set<Character> se = new HashSet<>() ; 
        for(int i = 0 ; i < s.length() ; i++){
            se.add(s.charAt(i)) ; 
        }
        System.out.println(se.size());
    }
}
