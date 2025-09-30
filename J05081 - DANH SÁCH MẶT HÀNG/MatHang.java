public class MatHang {
    private static int cnt = 1 ; 
    private String maMatHang , tenMatHang , donVi ; 
    private int giaMua , giaBan ,loiNhuan ; 

    public MatHang(String tenMatHang, String donVi, int giaMua, int giaBan) {
        this.tenMatHang = tenMatHang;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua ; 
        this.maMatHang = String.format("MH%03d",cnt++) ; 
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }
    
    @Override
    public String toString(){
        return maMatHang + " " + tenMatHang + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan ; 
    }
}
