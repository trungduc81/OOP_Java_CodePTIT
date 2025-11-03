import java.util.* ; 

class ThuNhap {
    private int luongChinh , phuCap , conLai , tamUng ; 
    private String ma , hoTen ; 
    
    public ThuNhap(String ma , String hoTen , String chucVu , int luongCoBan , int soNgayCong){
        this.ma = ma ; 
        this.hoTen = hoTen ; 
        
        if(chucVu.equals("GD")) this.phuCap = 500 ; 
        else if(chucVu.equals("PGD")) this.phuCap = 400 ; 
        else if(chucVu.equals("TP")) this.phuCap = 300 ; 
        else if(chucVu.equals("KT")) this.phuCap = 250 ; 
        else this.phuCap = 100 ; 
        
        this.luongChinh = soNgayCong * luongCoBan ; 
        int tmp = 2 * (this.phuCap + this.luongChinh) / 3 ; 
        if(tmp < 25000) this.tamUng = Math.round((float)tmp / 1000) * 1000 ; 
        else this.tamUng = 25000 ; 
        
        this.conLai = this.luongChinh - this.tamUng + this.phuCap ; 
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai ; 
    }
}
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("NV%02d",i) ; 
            String hoTen = sc.nextLine() ; 
            String chucVu = sc.nextLine() ; 
            int luongCoBan = Integer.parseInt(sc.nextLine()) ; 
            int soNgayCong = Integer.parseInt(sc.nextLine()) ; 
            ThuNhap tn = new ThuNhap(ma,hoTen,chucVu,luongCoBan,soNgayCong) ; 
            System.out.println(tn);
        }
    }
}








