import java.util.* ; 

class SinhVien implements Comparable<SinhVien> {
    private String hoTen ; 
    private int ex , sub ; 

    public SinhVien(String hoTen, int ex, int sub) {
        this.hoTen = hoTen;
        this.ex = ex;
        this.sub = sub;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.ex == o.ex) return this.sub - o.sub ; 
        else return o.ex - this.ex ; 
    }
    
    @Override
    public String toString() {
        return hoTen + " " + ex + " " + sub ; 
    }
    
}
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<SinhVien> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String hoTen = sc.nextLine() ; 
            int ex = sc.nextInt() , sub = sc.nextInt() ; 
            sc.nextLine() ; 
            ds.add(new SinhVien(hoTen,ex,sub)) ; 
        }
        Collections.sort(ds) ; 
        for(SinhVien i :ds){
            System.out.println(i);
        }
    }
}






