package j07048;

public class SanPham implements Comparable<SanPham> {
    private String ma , ten ; 
    private int thoiHan  , gia ; 

    public SanPham(String ma, String ten, int gia , int thoiHan ) {
        this.ma = ma;
        this.ten = ten;
        this.thoiHan = thoiHan;
        this.gia = gia;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.gia == o.gia ) return this.ma.compareTo(o.ma) ; 
        else if(this.gia < o.gia) return 1 ; 
        else return -1 ; 
    }
    
    @Override 
    public String toString(){
        return ma + " " + ten + " " + gia + " " + thoiHan ; 
    }
}
