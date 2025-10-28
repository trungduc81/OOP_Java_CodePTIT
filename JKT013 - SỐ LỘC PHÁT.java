import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("8") ; 
            q.add("6") ; 
            ArrayList<String> ds = new ArrayList<>() ; 
            while(true){
                String s = q.poll() ; 
                if(s.length() <= n){
                    ds.add(s) ; 
                    q.add(s + "6") ; 
                    q.add(s +"8") ; 
                }
                else break ; 
            }
            Collections.sort(ds, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length() == o2.length()){
                        return o2.compareTo(o1) ; 
                    }
                    else return o2.length() - o1.length() ; 
                }
            });
            System.out.println(ds.size());
            for(String s : ds){
                System.out.print(s + " ");
            }
            System.out.println("");
        }
    }
}
