import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine() ; 
        while(t-- > 0){
           String s = sc.nextLine() ; 
           Stack<Character> st = new Stack<>() ; 
           int check = 1 ; 
           for(int i = 0 ; i < s.length() ; i++){
               char tmp = s.charAt(i) ; 
               if(tmp=='{' || tmp=='[' || tmp=='(') st.push(tmp) ; 
               else {
                   if(!st.isEmpty()){
                       if(st.peek()=='(' && tmp == ')') st.pop() ;
                       else if(st.peek()=='[' && tmp == ']') st.pop() ;
                       else if(st.peek()=='{' && tmp == '}') st.pop() ;
                       else {
                           check = 0 ; 
                           break ;  
                       }
                   }
                   else {
                       check = 0 ; 
                       break ; 
                   }
               }
           }
           if(st.isEmpty() && check==1){
               System.out.println("YES");
           }
           else System.out.println("NO");
        }
    }
}
