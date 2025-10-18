package j07055;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = String.format("SV%02d", i + 1);
            String hoTen = sc.nextLine();
            float lt = Float.parseFloat(sc.nextLine());
            float th = Float.parseFloat(sc.nextLine());
            float thi = Float.parseFloat(sc.nextLine());

            BangDiem bd = new BangDiem(ma, hoTen, lt, th, thi);
            bd.chuanHoa();
            ds.add(bd);
        }

        Collections.sort(ds);
        for (BangDiem x : ds) {
            System.out.println(x);
        }
    }
}
