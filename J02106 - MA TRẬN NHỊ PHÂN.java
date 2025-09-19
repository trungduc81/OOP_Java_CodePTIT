import java.util.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; 
        int res = 0 ; 
        while(n-- > 0){
            int cnt = 0 ; 
            for(int i = 1 ; i <= 3 ; i++){
                int tmp = sc.nextInt() ; 
                if(tmp==1) cnt++ ; 
            }
            if(cnt>=2) res++ ; 
        }
        System.out.println(res); 
    }
}
