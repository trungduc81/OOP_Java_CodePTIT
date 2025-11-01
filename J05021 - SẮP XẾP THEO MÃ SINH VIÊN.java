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
        return this.ma.compareTo(o.ma) ; 
    }
    
    @Override
    public String toString(){
        return ma + " " + hoTen + " " + lop + " " + email ; 
    }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        ArrayList<SinhVien> ds = new ArrayList<>() ; 
        while(sc.hasNextLine()){ 
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ; 
        }
        Collections.sort(ds) ; 
        for(SinhVien i : ds){
            System.out.println(i);
        }
    }
}
