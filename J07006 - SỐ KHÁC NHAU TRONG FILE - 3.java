import java.util.* ;
import java.io.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in")) ;
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject() ;
            int[] cnt = new int[1005] ;
            for(Integer x : list){
                cnt[(int) x] ++ ;
            }
            for(int i = 0 ; i <=1000 ; i++){
                if(cnt[i] >0) {
                    System.out.println(i + " " + cnt[i]);
                }
            }
        }
    }
