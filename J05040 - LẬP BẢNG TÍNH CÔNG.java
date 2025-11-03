import java.util.* ; 

class TienLuong {
    private String ma ,hoTen ; 
    private int phuCap , thucLinh , thuong , luongThang ; 
    
    public TienLuong(String ma ,String hoTen , int luongNgay , int soNgayCong , String chucVu){
        this.ma = ma ; 
        this.hoTen = hoTen ; 
        
        this.luongThang = luongNgay * soNgayCong ; 
        if(soNgayCong >= 25) this.thuong = this.luongThang / 100 * 20 ; 
        else if(soNgayCong >= 22) this.thuong = this.luongThang / 100 * 10 ; 
        else this.thuong = 0 ; 
        
        if(chucVu.equals("GD")) this.phuCap = 250000 ; 
        else if(chucVu.equals("PGD")) this.phuCap = 200000 ; 
        else if(chucVu.equals("TP")) this.phuCap = 180000 ; 
        else this.phuCap = 150000 ; 
        this.thucLinh = this.luongThang + this.thuong + this .phuCap ; 
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thucLinh ; 
    }

    public int getThucLinh() {
        return thucLinh;
    }
            
}
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("NV%02d",i) ; 
            String hoTen = sc.nextLine() ; 
            int luongNgay = Integer.parseInt(sc.nextLine()) ; 
            int soNgayCong = Integer.parseInt(sc.nextLine()) ; 
            String chucVu = sc.nextLine() ; 
            TienLuong tl = new TienLuong(ma,hoTen,luongNgay,soNgayCong,chucVu) ;  
            System.out.println(tl);
        }
    }
}






