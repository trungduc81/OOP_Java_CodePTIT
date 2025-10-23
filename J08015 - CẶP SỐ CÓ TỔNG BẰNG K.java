import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            HashMap<Long, Long> mp = new HashMap<>();
            long cnt = 0;
            for(long x : a){
                long tmp = k - x;
                if(mp.containsKey(tmp)){
                    cnt += mp.get(tmp);
                }
                mp.put(x, mp.getOrDefault(x,0L) + 1);
            }
            System.out.println(cnt);
        }
    }
}
