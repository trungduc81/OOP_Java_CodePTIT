import java.util.*;

public class NewClass {
    static final int MAX = 2000005;
    static int[] spf = new int[MAX]; 

    public static void sang() {
        for (int i = 2; i < MAX; i++) spf[i] = i;
        for (int i = 2; i * i < MAX; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j < MAX; j += i) {
                    if (spf[j] == j) spf[j] = i; 
                }
            }
        }
    }

    public static int ptich(int n) {
        int sum = 0;
        while (n != 1) {
            sum += spf[n];
            n /= spf[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += ptich(x);
        }
        System.out.println(sum);
    }
}
