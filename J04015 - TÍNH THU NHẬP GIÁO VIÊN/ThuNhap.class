public class ThuNhap {
   private String maNgach , hoTen ; 
   private int bacLuong , phuCap , thuNhap ; 

    public ThuNhap(String ma, String ten, int luongCoBan) {
        this.maNgach = ma ;
        this.hoTen = ten ;
        this.bacLuong = (int)Integer.valueOf(ma.substring(2,4));
        this.thuNhap = luongCoBan * this.bacLuong ;
    }
    
    public void tongLuong(){
        String tmp = this.maNgach.substring(0,2) ; 
        if (tmp.equals("HT")){
            this.thuNhap += 2000000 ; 
            this.phuCap = 2000000 ; 
        }
        else if (tmp.equals("HP")){
            this.thuNhap += 900000 ;  
            this.phuCap = 900000 ; 
        }
        else {
            this.phuCap = 500000 ; 
            this.thuNhap += 500000 ; 
        }
    }
    
    @Override 
    public String toString(){
        return maNgach + " " + hoTen + " " + bacLuong + " " + phuCap + " " + thuNhap ; 
    }
}
