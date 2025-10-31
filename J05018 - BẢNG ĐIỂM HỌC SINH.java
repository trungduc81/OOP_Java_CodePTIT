import java.util.* ; 

class BangDiem implements Comparable<BangDiem> {
    private String ma , hoTen , xepLoai ; 
    private float diemTB ; 

    public BangDiem(String ma, String hoTen, float diemTB) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        
        if(this.diemTB >= 9) this.xepLoai = "XUAT SAC" ; 
        else if(this.diemTB >= 8) this.xepLoai = "GIOI" ; 
        else if(this.diemTB >= 7) this.xepLoai ="KHA" ; 
        else if(this.diemTB >= 5) this.xepLoai ="TB" ; 
        else this.xepLoai ="YEU" ; 
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + String.format("%.1f",diemTB) + " " + xepLoai ; 
    }

    @Override
    public int compareTo(BangDiem o) {
        if(Float.compare(o.diemTB , this.diemTB)==0) return this.ma.compareTo(o.ma) ; 
        else return Float.compare(o.diemTB,this.diemTB) ; 
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<BangDiem> ds = new ArrayList<>() ; 
        for(int i = 1 ; i<= n ; i++){
            String hoTen = sc.nextLine() ; 
            float[] diem = new float[10] ; 
            for(int j = 0 ; j< 10 ; j++) diem[j] = sc.nextFloat() ;
            float dtb = diem[0] * 2 + diem[1] *2 ; 
            for(int j = 2 ; j<10 ; j++) dtb += diem[j] ; 
            dtb = (float) ((float) Math.round(dtb / 12 * 10) / 10.0);
            String ma= String.format("HS%02d",i) ; 
            ds.add(new BangDiem(ma,hoTen,dtb)) ; 
            sc.nextLine() ; 
        } 
        Collections.sort(ds) ; 
        for(BangDiem i : ds){
            System.out.println(i);
        }
    }
}
