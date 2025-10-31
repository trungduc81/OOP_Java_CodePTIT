import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class NhanVien implements Comparable<NhanVien> {
    private String ma, hoTen, gioiTinh, ngaySinh, diaChi, mst, ngayKyHD; 
    private LocalDate birthDate; 

    public NhanVien(String ma, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKyHD) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngayKyHD = ngayKyHD;
        
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(ngaySinh.trim(), dtf);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.birthDate.compareTo(o.birthDate);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + mst + " " + ngayKyHD;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ma = String.format("%05d", i);
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String mst = sc.nextLine();
            String ngayKyHD = sc.nextLine();
            ds.add(new NhanVien(ma, hoTen, gioiTinh, ngaySinh, diaChi, mst, ngayKyHD));
        }
        Collections.sort(ds);
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
