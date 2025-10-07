package j07050;

public class MatHang implements Comparable<MatHang> {
    private String maHang , tenHang , nhomHang ; 
    private float giaMua , giaBan , loiNhuan ; 
    private static int cnt = 1 ; 

    public MatHang(String tenHang, String nhomHang, float giaMua, float giaBan) {
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.maHang = String.format("MH%02d",cnt++ ); 
        this.loiNhuan = this.giaBan - this.giaMua ; 
    }

    @Override
    public int compareTo(MatHang x) {
        if(this.loiNhuan < x.loiNhuan) return 1 ; 
        else return -1 ; 
    }
    
    @Override 
    public String toString(){
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f",loiNhuan); 
    }   
}
