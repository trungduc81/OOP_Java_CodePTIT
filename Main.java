import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();

        PhanSo m = new PhanSo(a, b);
        PhanSo n = new PhanSo(c, d);

        PhanSo tong = m.Cong(n);
        System.out.println(tong);
    }
}
