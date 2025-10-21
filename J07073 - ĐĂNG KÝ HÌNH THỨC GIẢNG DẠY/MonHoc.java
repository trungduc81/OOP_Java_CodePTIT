package j07073;

public class MonHoc implements Comparable<MonHoc> {
    private String ma, ten ,stc , lt , th ; 

    public MonHoc(String ma, String ten, String stc, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
        this.lt = lt;
        this.th = th;
    }

    @Override
    public int compareTo(MonHoc o) {
       return this.ma.compareTo(o.ma) ; 
    }
    
    @Override
    public String toString(){
        return ma + " "+ ten + " " + stc + " " + lt + " " + th ; 
    }

    public String getTh() {
        return th;
    }
    
}
