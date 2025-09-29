import java.util.* ; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong() , b = sc.nextLong() ; 
        PhanSo ps = new PhanSo(a,b) ; 
        ps.RutGon();
        System.out.println(ps);
    }
}
