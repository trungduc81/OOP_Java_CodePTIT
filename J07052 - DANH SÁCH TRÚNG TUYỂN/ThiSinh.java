package j07052;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ma , hoTen ; 
    private double diemToan , diemLy , diemHoa , tong , diemUuTien ; 
    private String trangThai ; 

    public ThiSinh(String ma, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    
    public void tongDiem(){
        String temp = this.ma.substring(0,3) ; 
        
        if(temp.equals("KV1")) this.diemUuTien =  0.5 ; 
        else if(temp.equals("KV2")) this.diemUuTien = 1.0 ; 
        else this.diemUuTien = 2.5 ; 
        this.tong = this.diemToan * 2 + this.diemLy + this.diemHoa + diemUuTien ; 
    }
    
    public void chuanHoa(){
        String[] arr = this.hoTen.split("\\s+") ; 
        String tmp = "" ; 
        for(int i = 0 ; i < arr.length ; i++){
            tmp += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() + " " ; 
        }
        this.hoTen = tmp.trim() ; 
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getTong() {
        return tong;
    }

    @Override
    public int compareTo(ThiSinh x) {
       if(this.tong == x.tong) return this.ma.compareTo(x.ma) ; 
       else if(this.tong < x.tong) return 1 ; 
       else return -1 ; 
    }
    
    @Override
    public String toString(){
        String DIEMUT , TONG ; 
        if(diemUuTien == (int) diemUuTien) DIEMUT = String.format("%d",(int) diemUuTien) ; 
        else DIEMUT = String.format("%.1f",diemUuTien) ; 
        if(tong == (int) tong) TONG = String.format("%d",(int) tong) ; 
        else TONG = String.format("%.1f",tong) ;
        
        return ma + " " + hoTen + " " + DIEMUT + " " + TONG + " " + trangThai;
    }                   
}
