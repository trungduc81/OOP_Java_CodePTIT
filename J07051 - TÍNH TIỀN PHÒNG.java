import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ; 
import java.math.* ;  
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class KhachHang implements Comparable<KhachHang> {
    private String ma , hoTen , soPhong , ngayNhanPhong , ngayTraPhong  ; 
    private int soNgayO , thanhTien , tienDichVu ; 

    public KhachHang(String ma ,String hoTen, String soPhong, String ngayNhanPhong, String ngayTraPhong, int tienDichVu) {
        this.ma = ma ; 
        this.hoTen = hoTen;
        this.soPhong = soPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.tienDichVu = tienDichVu;
    }
    
    public void chuanHoa(){
        String[] arr = this.hoTen.trim().split("\\s+") ; 
        String tmp = "" ; 
        for(int i = 0 ; i < arr.length ; i++){
            tmp += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() +" " ; 
        }
        this.hoTen = tmp.trim() ; 
    }
    
    public void xuly(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy") ; 
        LocalDate d1 = LocalDate.parse(ngayNhanPhong.trim(),dtf) ; 
        LocalDate d2 = LocalDate.parse(ngayTraPhong.trim(),dtf) ; 
        this.soNgayO = (int) ChronoUnit.DAYS.between(d1, d2) + 1 ; 
        
        if(soPhong.charAt(0) == '1') thanhTien = 25 * soNgayO + tienDichVu ; 
        else if(soPhong.charAt(0) == '2') thanhTien = 34 * soNgayO + tienDichVu ;
        else if(soPhong.charAt(0) == '3') thanhTien = 50 * soNgayO + tienDichVu ;
        else  thanhTien = 80 * soNgayO + tienDichVu ;
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.thanhTien - this.thanhTien ; 
    }
    
    @Override
    public String toString(){
        return ma + " " + hoTen + " " + soPhong + " " + soNgayO + " " + thanhTien ; 
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<KhachHang> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("KH%02d",i) ; 
            String hoTen = sc.nextLine() ; 
            String soPhong = sc.nextLine() ; 
            String ngayNhanPhong = sc.nextLine() ; 
            String ngayTraPhong = sc.nextLine() ; 
            int tienDichVu = Integer.parseInt(sc.nextLine()) ; 
            KhachHang kh = new KhachHang(ma,hoTen,soPhong,ngayNhanPhong,ngayTraPhong,tienDichVu) ; 
            kh.chuanHoa() ; 
            kh.xuly() ; 
            ds.add(kh) ; 
        }
        Collections.sort(ds) ; 
        for(KhachHang i : ds){
            System.out.println(i);
        }
    }
}
  
 
    
