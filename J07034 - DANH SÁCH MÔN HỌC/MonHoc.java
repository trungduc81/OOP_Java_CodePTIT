public class MonHoc {
    private String ma , ten ; 
    private int stc  ; 

    public MonHoc(String ma, String ten, int stc) {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
    }

    public String getTen() {
        return ten;
    }
    
    @Override 
    public String toString(){
        return ma + " " + ten + " " + stc ; 
    }
 
}
