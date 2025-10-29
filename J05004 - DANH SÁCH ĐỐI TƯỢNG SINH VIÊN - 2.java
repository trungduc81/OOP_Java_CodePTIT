import java.util.* ; 
import java.math.* ; 

class SinhVien {
    private String ma , hoTen , ngaySinh , lop ; 
    private float gpa ; 

    public SinhVien(String ma, String hoTen, String lop,String ngaySinh , float gpa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public void chuanHoa() {
        String[] arr = this.ngaySinh.trim().split("/");
        String ngay = arr[0];
        String thang = arr[1];
        String nam = arr[2];
        if (ngay.length() == 1) ngay = "0" + ngay;
        if (thang.length() == 1) thang = "0" + thang;
        this.ngaySinh = ngay + "/" + thang + "/" + nam ;  
        
        String[] ten = this.hoTen.trim().split("\\s+") ; 
        String tmp = "" ; 
        for(int i = 0 ; i < ten.length ; i++){
            tmp += Character.toUpperCase(ten[i].charAt(0)) + ten[i].substring(1).toLowerCase() + " " ; 
        }
        this.hoTen = tmp.trim() ; 
    }
    
    @Override 
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f",gpa) ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        for(int i = 0 ; i < n ; i++){
            sc.nextLine() ;
            String ma = String.format("B20DCCN%03d",i+1) ; 
            SinhVien sv = new SinhVien(ma , sc.nextLine() , sc.nextLine() , sc.nextLine() ,sc.nextFloat()) ; 
            sv.chuanHoa() ; 
            System.out.println(sv);
             
        }
    }
}
