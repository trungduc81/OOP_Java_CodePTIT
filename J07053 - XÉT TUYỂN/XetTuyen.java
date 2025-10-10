package j07053;

public class XetTuyen {
    private String hoTen , ngaySinh , xepLoai , ma ; 
    private float diemLT , diemTH, diemTB ; 
    private int tuoi ; 

    public XetTuyen(String ma , String hoTen, String ngaySinh, float diemLT, float diemTH) {
        this.ma = ma ; 
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLT= diemLT ;
        this.diemTH = diemTH;
    }
    
    public void chuanHoa(){
        String[] arr = this.ngaySinh.trim().split("/") ; 
        String ngay = arr[0];
        String thang = arr[1];
        String nam = arr[2];
        if(ngay.length() == 1) ngay = "0" + ngay;
        if(thang.length() == 1) thang = "0" + thang;
        this.ngaySinh = ngay + "/" + thang + "/" + nam ;     
        this.tuoi = 2021 - Integer.parseInt(nam) ; 
        
       
        String[] temp = this.hoTen.trim().split("\\s+") ; 
        String tmp = "" ; 
        for(String s : temp){
            tmp += Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase() + " "; 
        }
        this.hoTen = tmp.trim() ; 
    }
    
    public void thuong(){
        float diemThuong = 0;
        if(this.diemLT >= 8 && this.diemTH >= 8){
            diemThuong = 1;
        } else if(this.diemLT >= 7.5 && this.diemTH >= 7.5){
            diemThuong = 0.5f;
        }

        this.diemTB = (this.diemLT + this.diemTH) / 2 + diemThuong;
        if(this.diemTB > 10) this.diemTB = 10;
        this.diemTB = Math.round(this.diemTB); 

        if(this.diemTB < 5) this.xepLoai = "Truot";
        else if(this.diemTB < 7) this.xepLoai = "Trung binh";
        else if(this.diemTB == 7) this.xepLoai = "Kha";
        else if(this.diemTB == 8) this.xepLoai = "Gioi";
        else this.xepLoai = "Xuat sac";
    }
    
    @Override 
    public String toString(){
        return this.ma + " " + this.hoTen + " " + this.tuoi + " " + (int)this.diemTB + " " + this.xepLoai ; 
    }
}
