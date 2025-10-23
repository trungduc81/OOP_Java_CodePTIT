package luyentap;
import java.util.* ;
import java.io.* ; 
import java.math.BigInteger;

public class Main {
    public static int tinhtong(String s){
        int res = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            res += (s.charAt(i) - '0') ; 
        }
        return res ; 
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in")) ; 
        ArrayList<String> list = (ArrayList<String>) ois.readObject() ; 
        ArrayList<String> res = new ArrayList<>() ; 
        for(String s : list){
            String tmp = "" ; 
            for(int i = 0 ;  i< s.length() ; i++){
                if(Character.isDigit(s.charAt(i))) tmp += s.charAt(i) ; 
            }
            res.add(tmp) ; 
        }
        for(String s : res){
            BigInteger bg = new BigInteger(s) ; 
            System.out.println(bg + " " +  tinhtong(s));
        }
    }
}
