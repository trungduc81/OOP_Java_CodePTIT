public class SinhVien{ 
    private String hoTen , ngaySinh , lop , msv ; 
    private float gpa ; 

    public SinhVien(String msv , String hoTen, String ngaySinh, String lop, float gpa) {
        this.hoTen = hoTen;
        this.ngaySinh = chuanHoa(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
        this.msv = msv  ; 
    }
    
    public static String chuanHoa(String a){
        String[] arr = a.trim().split("/"); 
        String ngay = arr[0];
        String thang = arr[1];
        String nam = arr[2];
        if(ngay.length() == 1) ngay = "0" + ngay ;
        if(thang.length() == 1) thang = "0" + thang ;
        return ngay + "/" + thang + "/" + nam ;
    } 
    @Override
    public String toString(){
        return "B20DCCN" +msv + " "+ hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f",gpa) ; 
    }
    
}
