import java.util.* ; 

class MatHang implements Comparable<MatHang> {
    private String ma , ten , donVi ; 
    private int phiVanChuyen , thanhTien , giaBan ; 
    
    public MatHang(String ma , String ten , String donVi , int donGiaNhap , int soLuong){
        this.ma = ma ; 
        this.ten = ten ; 
        this.donVi = donVi ; 
        
        this.phiVanChuyen = Math.round((donGiaNhap * soLuong) * 5/ 100 ) ; 
        this.thanhTien = Math.round(donGiaNhap * soLuong+ this.phiVanChuyen) ; 
        
        float giaTB = (float)(this.thanhTien * 1.02 / soLuong);
        this.giaBan = (int)(Math.ceil(giaTB / 100) * 100);
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien  + " " + giaBan ; 
    }

    @Override
    public int compareTo(MatHang o) {
        return o.giaBan - this.giaBan ; 
    }
}
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<MatHang> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("MH%02d",i) ; 
            MatHang mh = new MatHang(ma,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()) ; 
            sc.nextLine() ; 
            ds.add(mh) ; 
        }
        Collections.sort(ds) ; 
        for(MatHang i :ds){
            System.out.println(i);
        }
    }
}




