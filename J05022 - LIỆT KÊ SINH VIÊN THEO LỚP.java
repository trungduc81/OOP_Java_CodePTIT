import java.util.* ; 

class SinhVien {
    private String ma , hoTen , lop , email ; 

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
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
            System.out.println("DANH SACH SINH VIEN LOP " + truy_van[i] + ":");  
            for(SinhVien sv : ds){
                if(truy_van[i].equals(sv.getLop())){
                    System.out.println(sv);
                }
            }
        }
    }
}
