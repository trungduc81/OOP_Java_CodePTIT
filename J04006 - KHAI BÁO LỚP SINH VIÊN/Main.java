import java.util.* ; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String ten = sc.nextLine() , lop = sc.nextLine() , ngaysinh = sc.nextLine() ; 
        float diem = sc.nextFloat() ; 
        SinhVien a = new SinhVien(ten,SinhVien.ChuanHoa(ngaysinh),lop,diem) ; 
        System.out.println(a);
    }
}
