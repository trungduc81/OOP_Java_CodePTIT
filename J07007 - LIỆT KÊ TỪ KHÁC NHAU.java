import java.util.* ;
import java.io.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("VANBAN.in") ; 
        FileReader fr = new FileReader(f) ; 
        BufferedReader br = new BufferedReader(fr) ; 
        Set<String> se = new TreeSet<>() ; 
        while(true){
            String line = br.readLine() ; 
            if(line == null) break ; 
            String[] arr = line.trim().split("\\s+") ; 
            for(String x : arr){
                x = x.toLowerCase() ; 
                se.add(x) ; 
            }
        }
        for(String x :se){
            System.out.println(x);
        }
        fr.close() ; 
        br.close() ; 
    }
}
