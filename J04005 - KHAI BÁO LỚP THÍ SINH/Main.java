import java.util.* ; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String ten = sc.nextLine() ; 
        String ngaysinh = sc.nextLine() ; 
        double d1 = sc.nextDouble() , d2 = sc.nextDouble() , d3 = sc.nextDouble() ; 
        ThiSinh a = new ThiSinh(ten,ngaysinh,d1,d2,d3) ; 
        System.out.println(a);
    }
}
