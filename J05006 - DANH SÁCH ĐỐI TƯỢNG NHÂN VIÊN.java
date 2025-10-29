import java.util.*; 

class NhanVien {
    private String ma, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHD; 

    public NhanVien(String ma, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHD) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHD = ngayKyHD;
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " 
               + diaChi + " " + maSoThue + " " + ngayKyHD;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = Integer.parseInt(sc.nextLine());  
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = String.format("%05d", i + 1);
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKyHD = sc.nextLine();
            ds.add(new NhanVien(ma, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHD));
        }
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
