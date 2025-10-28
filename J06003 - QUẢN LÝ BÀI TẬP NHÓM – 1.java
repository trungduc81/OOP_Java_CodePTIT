import java.util.* ; 

class SinhVien {
    private String ma , hoTen , sdt ; 
    private int stt ; 

    public SinhVien(String ma, String hoTen, String sdt, int stt) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.stt = stt;
    }

    public int getStt() {
        return stt;
    }
    
    @Override 
    public String toString() {
        return ma + " " + hoTen + " " + sdt ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() , m = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<SinhVien> dssv = new ArrayList<>() ;
        ArrayList<String> dsnhom = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            dssv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt())) ; 
            sc.nextLine() ; 
        }
        for(int i = 1 ; i <= m ; i++){
            dsnhom.add(sc.nextLine()) ; 
        }
        int q = sc.nextInt() ; 
        int[] truy_van = new int[q] ; 
        for(int i = 0 ; i < q ; i++) truy_van[i] = sc.nextInt() ; 
        for(int i = 0 ; i < q ; i++){
            int tmp = truy_van[i] ; 
            System.out.printf("DANH SACH NHOM " + tmp +":\n");
            for(SinhVien sv : dssv){
                if(sv.getStt() == tmp){
                    System.out.println(sv);
                }
            }
            System.out.printf("Bai tap dang ky: ");
            System.out.println(dsnhom.get(tmp-1)); 
        } 
    }
}
