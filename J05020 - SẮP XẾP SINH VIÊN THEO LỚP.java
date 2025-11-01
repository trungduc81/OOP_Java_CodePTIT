import java.util.* ; 

class SinhVien implements Comparable<SinhVien> {
    private String ma , hoTen , lop , email ; 

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.lop.equals(o.lop)) return this.ma.compareTo(o.ma) ; 
        else return this.lop.compareTo(o.lop) ; 
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
        Collections.sort(ds) ; 
        for(SinhVien i : ds){
            System.out.println(i);
        }
    }
}
