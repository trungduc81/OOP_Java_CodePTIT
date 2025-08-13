import java.util.Scanner;

public class NewClass {
    public static int isPrime(int n){
        if(n < 2) return 0;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int T = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.print("Test " + T + ": ");
            T++;
            for(int i = 2; i * i <= n; i++){
                int cnt = 0;
                if(isPrime(i) == 1){
                    while(n % i == 0){
                        cnt++;
                        n /= i;
                    }
                    if(cnt > 0){
                        System.out.print(i + "(" + cnt + ") ");
                    }
                }
            }
            if(n > 1){
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
    }
}
