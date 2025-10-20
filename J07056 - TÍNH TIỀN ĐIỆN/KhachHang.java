package j07056;

public class KhachHang implements Comparable<KhachHang> {
    private String hoTen , ma ; 
    private int tienDinhMuc ,tienVuot , vat , tong ; 

    public KhachHang(String hoTen, String ma) {
        this.hoTen = hoTen;
        this.ma = ma;
    }
    
    public void chuanHoa(){
        String[] arr = this.hoTen.trim().split("\\s+") ; 
        String temp = "" ; 
        for(int i = 0 ; i < arr.length ; i++){
            temp += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() + " " ; 
        }
        this.hoTen = temp.trim() ; 
    }
    
    public void tinhToan(String line){
        String[] arr = line.trim().split("\\s+") ; 
        int dinhMuc ; 
        if(arr[0].equals("A")) dinhMuc = 100 ; 
        else if(arr[0].equals("B")) dinhMuc = 500 ; 
        else dinhMuc = 200 ; 
        int soCuoi = Integer.parseInt(arr[2]) , soDau = Integer.parseInt(arr[1]) ; 
        if( soCuoi - soDau <= dinhMuc){
            this.tienDinhMuc = (soCuoi-soDau)*450 ; 
            this.tienVuot = 0 ; 
            this.vat = 0 ; 
        } 
        else{
            this.tienDinhMuc = dinhMuc *450 ; 
            this.tienVuot = (soCuoi - soDau - dinhMuc) * 1000 ;
            this.vat = 5 * this.tienVuot / 100 ; 
        }
        this.tong = this.tienDinhMuc + this.tienVuot  + this.vat ;         
    }

    @Override
    public int compareTo(KhachHang x) {
        return x.tong - this.tong ; 
    }
    
    @Override 
    public String toString(){
        return ma + " " + hoTen + " " + tienDinhMuc + " " + tienVuot + " " + vat + " " + tong ; 
    }  
}
