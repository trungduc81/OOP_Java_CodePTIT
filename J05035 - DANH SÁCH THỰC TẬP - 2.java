import java.util.* ; 

class SinhVien implements Comparable<SinhVien> {
    private String stt , msv , hoTen , lop , email , doanhNghiep ; 

    public SinhVien(String stt, String msv, String hoTen, String lop, String email, String doanhNghiep) {
        this.stt = stt;
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    @Override
    public int compareTo(SinhVien o) {
       return this.msv.compareTo(o.msv) ; 
    }
    
    @Override
    public String toString() {
        return stt + " " + msv + " " + hoTen + " " + lop + " " + email + " " + doanhNghiep ; 
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<SinhVien> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("%d",i) ; 
            ds.add(new SinhVien(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ; 
        }
        Collections.sort(ds) ; 
        int q = sc.nextInt() ; sc.nextLine() ; 
        for(int i = 1 ; i <= q ; i++){
            String dn = sc.next() ; 
            for(SinhVien sv : ds){
                if(sv.getDoanhNghiep().equals(dn)){
                    System.out.println(sv);
                }
            }
            System.out.println("");
        }
    }
}

