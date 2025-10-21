package j07058;

public class MonHoc implements Comparable<MonHoc> {
    private String ma , ten , hinhThuc ; 

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public int compareTo(MonHoc o) {
       return this.ma.compareTo(o.ma) ; 
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + hinhThuc ; 
    }
}
