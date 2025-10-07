package j07052;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma = sc.nextLine();
            String hoTen = sc.nextLine().trim();
            float diemToan = Float.parseFloat(sc.nextLine());
            float diemLy = Float.parseFloat(sc.nextLine());
            float diemHoa = Float.parseFloat(sc.nextLine());
            ThiSinh x = new ThiSinh(ma, hoTen, diemToan, diemLy, diemHoa);
            x.chuanHoa();
            x.tongDiem();
            ds.add(x);
        }

        int chiTieu = Integer.parseInt(sc.nextLine()); 
        Collections.sort(ds);
        double diemChuan = 0;
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).setTrangThai("TRUNG TUYEN");
            diemChuan = ds.get(i).getTong();
            chiTieu--;
            if (chiTieu == 0) {
                for (int j = i + 1; j < ds.size(); j++) {
                    if (ds.get(j).getTong() == diemChuan)
                        ds.get(j).setTrangThai("TRUNG TUYEN");
                    else 
                        ds.get(j).setTrangThai("TRUOT");
                }
                break ;
            }
        }

        System.out.println(String.format("%.1f", diemChuan));
        for (ThiSinh x : ds)
            System.out.println(x);
    }
}
