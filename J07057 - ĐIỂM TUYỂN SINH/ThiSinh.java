package j07057;

public class ThiSinh implements Comparable<ThiSinh> {
    private String hoTen , danToc , khuVuc  , ma , trangThai ; 
    private float diem , tongDiem ; 

    public ThiSinh(String hoTen, String danToc, String khuVuc, float diem , String ma) {
        this.hoTen = hoTen;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        this.diem = diem;
        this.ma = ma ; 
    }
    
    public void chuanHoa(){
        String[] arr = this.hoTen.trim().split("\\s+") ; 
        String temp = "" ; 
        for(int i  = 0 ; i < arr.length ; i++){
            temp += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() + " " ; 
        }
        this.hoTen = temp.trim() ; 
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(Math.abs(o.tongDiem - this.tongDiem) < 1e-6){
            return this.ma.compareTo(o.ma) ; 
        }
        return Float.compare(o.tongDiem , this.tongDiem)  ; 
    }
    
    public void tinhToan(){
        if(this.khuVuc.equals("1")) this.tongDiem = (float) (1.5 + this.diem) ; 
        else if(this.khuVuc.equals("2")) this.tongDiem = (this.diem + 1) ; 
        else this.tongDiem = this.diem ; 
        if(!this.danToc.equals("Kinh")) this.tongDiem = (float) (this.tongDiem + 1.5) ; 
        
        if(this.tongDiem >= 20.5) this.trangThai = "Do" ; 
        else this.trangThai = "Truot" ; 
    }
    
    @Override 
    public String toString(){
        return ma + " " + hoTen + " " + tongDiem + " " + trangThai ; 
    } 
}
