import java.util.* ; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String hoten = sc.nextLine();      
        String gioitinh = sc.nextLine();   
        String ngaysinh = sc.nextLine();   
        String diachi = sc.nextLine();     
        String mst = sc.nextLine();        
        String ngayky = sc.nextLine();  
        NhanVien a = new NhanVien(hoten,gioitinh,ngaysinh,diachi,mst,ngayky) ; 
        System.out.println(a);
    } 
}
