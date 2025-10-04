public class DoanhNghiep {
    private String ma , ten ; 
    private int ssv ; 

    public DoanhNghiep(String ma, String ten, int ssv) {
        this.ma = ma;
        this.ten = ten;
        this.ssv = ssv;
    }

    public String getMa() {
        return ma ;
    }
    
    @Override 
    public String toString(){
        return ma + " " + ten + " " + ssv ; 
    }

}
