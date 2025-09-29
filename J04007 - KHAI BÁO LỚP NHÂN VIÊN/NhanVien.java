public class NhanVien {
    private String hoten , gioitinh , ngaysinh , diachi , mst , ngayky ; 

    public NhanVien(String hoten, String gioitinh, String ngaysinh, String diachi, String mst, String ngayky) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mst = mst;
        this.ngayky = ngayky;
    }

    @Override
    public String toString() {
        return  "00001" + " " + hoten +" "+ gioitinh+" " + ngaysinh +" "+ diachi +" "+ mst + " "+ ngayky ;
    }
    
    
}
