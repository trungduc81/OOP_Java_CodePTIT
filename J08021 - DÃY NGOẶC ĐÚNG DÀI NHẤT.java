import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine(); 
        while(t-- > 0){
            String s = sc.nextLine(); 
            Stack<Integer> st = new Stack<>(); 
            int MAX = 0; 
            st.push(-1); 
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i); 
                if(c == '(') st.push(i); 
                else {
                    st.pop(); 
                    if(!st.isEmpty()){
                        MAX = Math.max(MAX, i - st.peek()); 
                    }
                    else {
                        st.push(i); 
                    }
                }
            }
            System.out.println(MAX);
        }
    }
}
