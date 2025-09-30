import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("DATA.in");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        long sum = 0 ; 

        while(true) {
            String line = br.readLine() ; 
            if(line == null) break ; 
            String[] arr = line.trim().split("\\s+") ; 
            for(int i = 0 ; i < arr.length ; i++){
                try {
                    int tmp = Integer.parseInt(arr[i]);
                    sum += tmp ; 
                } 
                catch (NumberFormatException e){
                    }
                }
            }
        System.out.println(sum);
        br.close(); 
    }
}
