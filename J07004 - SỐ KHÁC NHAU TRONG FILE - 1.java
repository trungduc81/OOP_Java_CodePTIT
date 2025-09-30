import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("DATA.in") ; 
        FileReader fr = new FileReader(f) ; 
        BufferedReader br = new BufferedReader(fr) ; 
        int[] cnt = new int[1005] ; 
        
        while(true){
            String line = br.readLine() ; 
            if(line == null) break ; 
            String[] arr = line.trim().split("\\s+") ; 
            for(int i = 0 ; i < arr.length ; i++){
                try {
                    int tmp = Integer.parseInt(arr[i]) ; 
                    cnt[tmp]++ ; 
                } catch (NumberFormatException e) {
                }
            }
        }
        for(int i = 0 ; i < 1005 ; i++){
            if(cnt[i]>0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }    
}
