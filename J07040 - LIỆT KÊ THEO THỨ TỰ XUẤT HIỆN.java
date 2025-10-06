import java.io.* ; 
import java.util.* ; 

public class Main{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileReader fr = new FileReader(new File("VANBAN.in")) ; 
        BufferedReader br = new BufferedReader(fr) ; 
        Set<String> vanban = new LinkedHashSet<>() ; 
        Set<String> nhiphan = new LinkedHashSet<>(); 
        while(true){
            String line = br.readLine() ; 
            if(line==null) break ;
            line = line.toLowerCase() ; 
            String[] arr = line.trim().split("\\s+") ; 
            Collections.addAll(vanban,arr) ; 
        }
        br.close() ; 
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in")) ; 
        ArrayList<String> list =  (ArrayList<String>) ois.readObject() ; 
        for(String s : list){
            String[] tmp = s.toLowerCase().split("\\s+");
            Collections.addAll(nhiphan, tmp);
        }
        ois.close() ; 
        for(String x : vanban){
            if(nhiphan.contains(x)){
                System.out.println(x) ;
            }
        }
    }
}
