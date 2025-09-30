import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("DATA.IN");
        DataInputStream dis = new DataInputStream(fis);
        int[] cnt = new int[1005]; 
        for (int i = 0; i < 100000; i++) {
            int x = dis.readInt();  
            cnt[x]++;
        }
        dis.close();
        for (int i = 0; i <= 1000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
