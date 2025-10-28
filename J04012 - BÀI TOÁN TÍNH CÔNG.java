import java.util.* ; 

class NhanVien {
   private String ma , hoTen , chucVu ; 
   private int luongCoBan , soNgayCong ; 
   private int luongThang , phuCap , thuong , thuNhap ; 

    public NhanVien(String ma , String hoTen, int luongCoBan, int soNgayCong , String chucVu) {
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.ma = ma ; 
    }
    
    public void xuly(){
        this.luongThang = this.soNgayCong * this.luongCoBan ; 
        if(this.soNgayCong >= 25) this.thuong = this.luongThang * 20 / 100 ; 
        else if(this.soNgayCong >= 22) this.thuong = this.luongThang * 10 /100 ; 
        else this.thuong = 0 ; 
        if(this.chucVu.equals("GD")) this.phuCap = 250000 ; 
        else if(this.chucVu.equals("PGD")) this.phuCap = 200000 ; 
        else if(this.chucVu.equals("TP")) this.phuCap = 180000 ; 
        else if(this.chucVu.equals("NV")) this.phuCap = 150000 ; 
        
        this.thuNhap = this.luongThang + this.thuong + this.phuCap ; 
    }
    
    @Override
    public String toString(){
        return ma + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String ma = "NV01" ; 
        String hoTen = sc.nextLine() ; 
        int luongCoBan = sc.nextInt() ; sc.nextLine() ; 
        int soNgayCong = sc.nextInt() ; sc.nextLine() ; 
        String chucVu = sc.nextLine() ; 
        NhanVien nv = new NhanVien(ma , hoTen , luongCoBan , soNgayCong , chucVu) ; 
        nv.xuly() ; 
        System.out.println(nv);
    }
}
