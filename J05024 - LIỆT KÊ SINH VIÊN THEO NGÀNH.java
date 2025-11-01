import java.util.* ; 

class SinhVien {
    private String ma , hoTen , lop , email ; 

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return ma + " " + hoTen + " " + lop + " " + email ; 
    }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<SinhVien> ds = new ArrayList<>() ; 
        for(int i = 1 ; i<=n ; i++){
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ; 
        }
        int q = sc.nextInt() ; sc.nextLine() ; 
        String[] truy_van = new String[q] ; 
        for(int i = 0 ;i < q ; i++) truy_van[i] = sc.nextLine().toUpperCase() ; 
        for(int i = 0 ;i < q ; i++){
            String tmp = truy_van[i] ; 
            System.out.println("DANH SACH SINH VIEN NGANH " + tmp + ":");  
            String nganh ; 
            if(tmp.equals("KE TOAN")) nganh = "DCKT" ; 
            else if(tmp.equals("CONG NGHE THONG TIN")) nganh = "DCCN" ; 
            else if(tmp.equals("AN TOAN THONG TIN")) nganh = "DCAT" ; 
            else if(tmp.equals("VIEN THONG")) nganh = "DCVT" ; 
            else nganh = "DCDT" ; 
            
            for(SinhVien sv : ds){
                String msv = sv.getMa().substring(3,7) ; 
                if(nganh.equals(msv)){
                    if(nganh.equals("DCCN") || nganh.equals("DCAT")){
                        if(sv.getLop().charAt(0) != 'E') System.out.println(sv);
                    }
                    else System.out.println(sv);
                }
            }
        }
    }
}



 
