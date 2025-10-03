import java.io.* ;
import java.util.* ; 
public class Main{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("DATA.in") ; 
        FileReader fr = new FileReader(f) ; 
        BufferedReader br = new BufferedReader(fr) ; 
        ArrayList<String> res = new ArrayList<>() ; 
        while(true){
            String line = br.readLine() ; 
            if(line == null) break ; 
            String[] arr = line.trim().split("\\s+") ; 
            for(int i = 0 ; i < arr.length ; i++){
                try {
                    int tmp = Integer.parseInt(arr[i]) ; 
                } catch (NumberFormatException e) {
                     res.add(arr[i]) ; 
                }
            }  
        }
        Collections.sort(res) ; 
        br.close() ; 
        fr.close() ; 
        for(String x : res){
            System.out.printf(x + " ");
        }
        
    }
}
