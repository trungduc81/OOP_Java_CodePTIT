import java.util.* ; 

class MatHang {
    private String ma , ten , donVi ; 
    private int phiVanChuyen , thanhTien , giaBan ; 
    
    public MatHang(String ma , String ten , String donVi , int donGiaNhap , int soLuong){
        this.ma = ma ; 
        this.ten = ten ; 
        this.donVi = donVi ; 
        
        this.phiVanChuyen = Math.round((donGiaNhap * soLuong) * 5 / 100) ; 
        this.thanhTien = Math.round(donGiaNhap * soLuong+ this.phiVanChuyen) ; 
        this.giaBan = (int) Math.round(this.thanhTien * 1.02 )  ; 
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien  + " " + giaBan ; 
    }
}
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("MH%02d",i) ; 
            MatHang mh = new MatHang(ma,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()) ; 
            sc.nextLine() ; 
            System.out.println(mh);
        }
    }
}



