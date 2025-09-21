import java.util.*;

public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<String> a = new ArrayList<>(); 
        while(t-- > 0){
            String s = sc.nextLine().toLowerCase().trim();
            String[] arr = s.split("\\s+");
            String tmp = arr[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++){
                tmp += arr[i].charAt(0);
            }
            int cnt = 0;
            for(String x : a){
                String temp = "" ; 
                for(int i = 0 ; i < x.length() ; i++){
                    if(Character.isLetter(x.charAt(i))){
                        temp += x.charAt(i) ; 
                    }
                } 
                if(tmp.compareTo(temp)==0) cnt++ ; 
                
            }
            if(cnt > 0) a.add(tmp + (cnt + 1)); 
            else a.add(tmp);
        }
        for(String x : a){ 
            System.out.println(x + "@ptit.edu.vn");
        }
    }
}
