import java.util.*;

class DonHang {
    private String tenHang, maHang;
    private int thanhTien, chietKhau;
    private static Map<String, Integer> cnt = new HashMap<>();

    public DonHang(String tenHang, int soLuong, int donGia) {
        this.tenHang = tenHang;

        String[] arr = tenHang.trim().split("\\s+");
        String tmp = "" + Character.toUpperCase(arr[0].charAt(0)) + Character.toUpperCase(arr[1].charAt(0));
        int id = cnt.getOrDefault(tmp, 0) + 1;
        cnt.put(tmp, id);
        this.maHang = tmp + String.format("%02d", id);

        if (soLuong > 10) this.chietKhau = 5 * donGia * soLuong / 100;
        else if (soLuong >= 8) this.chietKhau = 2 * donGia * soLuong / 100;
        else if (soLuong >= 5) this.chietKhau = donGia * soLuong / 100;
        else this.chietKhau = 0;

        this.thanhTien = donGia * soLuong - this.chietKhau;
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + chietKhau + " " + thanhTien;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine();
        while (n-- > 0) {
            DonHang dh = new DonHang(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            System.out.println(dh);
        }
    }
}
