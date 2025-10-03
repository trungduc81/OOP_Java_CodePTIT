import java.io.* ;
import java.util.* ; 
public class Main{
    public static boolean isprime(int n){
        if(n<2) return false ; 
        for(int i = 2 ; i*i <= n ; i++){
            if(n%i==0) return false ; 
        }
        return true  ; 
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in") ; 
        ObjectInputStream ois = new ObjectInputStream(fis) ; 
        Map<Integer , Integer> mp = new TreeMap<>(Collections.reverseOrder()) ; 
        ArrayList<Integer> list =  (ArrayList<Integer>) ois.readObject() ; 
        ois.close() ; 
        for(Integer x : list){
            if(isprime(x)){
                if(!mp.containsKey(x)) mp.put(x,1) ; 
                else {
                    int v = mp.get(x) ; 
                    mp.put(x,v+1) ; 
                }
            }
        }
        int cnt = 0 ; 
        for(Integer i : mp.keySet()){
            cnt++ ; 
            System.out.println(i + " " + mp.get(i));
            if(cnt==10) break ; 
        }     
    }
}

 
