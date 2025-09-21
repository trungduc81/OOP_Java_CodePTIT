import java.util.*;
import java.math.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next() ; 
        Stack<Character> st = new Stack<>() ; 
        for(int i = 0 ; i <  s.length() ; i++){
            if(!st.isEmpty()){
                char c = st.peek() ; 
                if(c == s.charAt(i)) st.pop() ; 
                else st.push(s.charAt(i)) ; 
            }
            else st.push(s.charAt(i)) ; 
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else {
            List<Character> a = new ArrayList<>() ; 
            while(!st.isEmpty()){
                a.add(st.peek()) ; 
                st.pop() ;    
            }
            for(int i = a.size() - 1 ; i >= 0 ; i--){
                System.out.print(a.get(i));
            }
            System.out.println("");
        }
    }
}
