package j07033;


public class SinhVien {
    private String msv , hoTen , lop , email ; 

    public SinhVien(String msv, String hoTen, String lop, String email) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    
    public void chuanHoa(){
        String[] arr = this.hoTen.trim().split("\\s+") ; 
        String tmp = "" ; 
        for(int i = 0 ; i < arr.length ; i++){
            tmp += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() + " " ; 
        }
        this.hoTen = tmp.trim() ; 
    }

    public String getMsv() {
        return msv;
    }
    
    @Override
    public String toString(){
        return msv + " " + hoTen + " " + lop + " " + email ; 
    }
}
