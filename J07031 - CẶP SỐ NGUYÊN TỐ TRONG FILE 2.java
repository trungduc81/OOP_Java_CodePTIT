import java.io.*;
import java.util.*;

public class Main{
    public static HashSet<Integer> sang(int n){
        boolean[] prime = new boolean[n+1]; 
        Arrays.fill(prime,true); 
        prime[0] = prime[1] = false; 
        for(int i = 2; i*i <= n; i++){
            if(prime[i]){
                for(int j = i*i; j <= n; j+=i) prime[j] = false; 
            }
        }
        HashSet<Integer> era = new HashSet<>(); 
        for(int i = 2; i <= n; i++){
            if(prime[i]) era.add(i); 
        }
        return era; 
    }
    
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in")); 
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject(); 
        ois1.close(); 
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in")); 
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject(); 
        ois2.close();

       
        TreeSet<Integer> set1 = new TreeSet<>(list1);
        TreeSet<Integer> set2 = new TreeSet<>(list2);

        HashSet<Integer> prime = sang(1000000); 

        for(int x : set1){
            int y = 1000000 - x;
            if(x < y && set1.contains(y) && prime.contains(x) && prime.contains(y) && !set2.contains(y) && !set2.contains(x)){
                System.out.println(x + " " + y);
            }
        }
    }
}
