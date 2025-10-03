import java.util.* ;
import java.io.* ; 

public class Main {
    static boolean[] prime = new boolean[10005] ; 
    public static void sang(){
        Arrays.fill(prime,true) ; 
        prime[0] = prime[1] = false ; 
        for(int i = 2 ; i*i < 10005 ; i++){
            if(prime[i]){
                for(int j = i*i ; j < 10005 ; j+=i){
                    prime[j] = false ; 
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sang() ; 
        int[] cnt = new int[10005] ;  
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in")) ;
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject() ;
        ois.close() ; 
        for(Integer x : list) cnt[(int)x]++ ; 
        for(int i = 0 ; i <= 10000 ; i++){
            if(prime[i] && cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }  
}
