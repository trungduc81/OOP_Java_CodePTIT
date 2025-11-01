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
        for(int i = 0 ;i < q ; i++) truy_van[i] = sc.next() ; 
        for(int i = 0 ;i < q ; i++){
            String tmp = truy_van[i] ; 
            System.out.println("DANH SACH SINH VIEN KHOA " + tmp + ":");  
            for(SinhVien sv : ds){
                String khoa = "20" + sv.getLop().substring(1,3) ; 
                if(tmp.equals(khoa)){
                    System.out.println(sv);
                }
            }
        }
    }
}




 
