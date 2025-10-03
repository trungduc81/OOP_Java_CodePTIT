import java.util.* ; 
import java.io.* ; 
public class Main{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("DATA.in") ; 
        FileReader fr = new FileReader(f) ; 
        BufferedReader br = new BufferedReader(fr) ; 
        ArrayList<String> res = new ArrayList<>() ; 
        while(true){
            String line = br.readLine() ; 
            if(line.trim().equals("END")) break ; 
            String[] arr = line.trim().split("\\s+") ; 
            String tmp = "" ; 
            for(int i = 0 ; i < arr.length ; i++){
                 tmp += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1,arr[i].length()).toLowerCase() + " " ; 
            }
            res.add(tmp) ; 
            
        }
        br.close() ; 
        fr.close() ; 
        for(String x : res){
            System.out.println(x);
        }
        
    }
}
