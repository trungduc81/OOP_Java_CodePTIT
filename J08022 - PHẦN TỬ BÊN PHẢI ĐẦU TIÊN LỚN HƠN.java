import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-- > 0){
           int n = sc.nextInt() ; 
           int[] a = new int[n] ;
           for(int i = 0  ; i < n ; i++) a[i] = sc.nextInt() ; 
           int[] res = new int[n] ; 
            Arrays.fill(res,-1) ; 
           Stack<Integer> st = new Stack<>() ; 
           for(int i = n-1 ; i >=0 ; i--){
               while(!st.isEmpty() && st.peek() <= a[i]) st.pop() ; 
               if(!st.isEmpty()) res[i] = st.peek() ; 
               st.push(a[i]) ; 
           }
           for(int i : res){
               System.out.print(i + " ");
           }
            System.out.println("");
        }    
    }
}
