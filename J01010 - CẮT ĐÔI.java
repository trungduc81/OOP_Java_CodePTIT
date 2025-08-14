import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            String s = sc.next() ; 
            String tmp= "";
            boolean ok = true;
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9'){
                    ok = false ; 
                    break ; 
                }
                else if(s.charAt(i) == '1') tmp += "1" ; 
                else tmp+= "0" ; 
            }
            if(!ok) {
                System.out.println("INVALID");
            }
            else{
                Long x = Long.parseLong(tmp);
                if (x == 0) System.out.println("INVALID");
                else System.out.println(x);
            }
        }
    }
}
