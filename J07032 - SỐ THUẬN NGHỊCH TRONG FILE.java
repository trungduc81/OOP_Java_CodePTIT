import java.io.*;
import java.util.*;

public class Main{
    public static boolean check(int n){
        int scs = 0 , rev = 0 , tmp = n ; 
        while(n > 0){
            int m = n % 10 ; 
            if(m % 2 == 0) return false ; 
            rev = rev * 10 + m ; 
            scs++ ; 
            n /= 10 ; 
        }
        return scs > 1 && scs % 2 == 1 && rev == tmp; 
    }
    
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in")); 
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject(); 
        ois1.close(); 
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in")); 
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject(); 
        ois2.close();

        int MAX = 1000000; 
        int[] cnt = new int[MAX+1]; 
        boolean[] in1 = new boolean[MAX+1];
        boolean[] in2 = new boolean[MAX+1];

        for(Integer x : list1){
            cnt[x]++; 
            in1[x] = true; 
        }
        for(Integer x : list2){
            cnt[x]++; 
            in2[x] = true; 
        }

        int count = 0; 
        for(int i = 0; i <= MAX; i++){
            if(in1[i] && in2[i] && check(i)){
                System.out.println(i + " " + cnt[i]);
                count++; 
                if(count == 10) break; 
            }
        }
    }
}
