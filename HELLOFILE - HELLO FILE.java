import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("Hello.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        while(true) {
            String line = br.readLine() ; 
            if(line == null) break ; 
            System.out.println(line);
        }
        br.close(); 
    }
}
