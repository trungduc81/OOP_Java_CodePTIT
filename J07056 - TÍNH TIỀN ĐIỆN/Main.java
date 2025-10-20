package j07056;
import java.io.* ; 
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<KhachHang> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("KH%02d",i) ; 
            String hoTen = sc.nextLine() ; 
            String line = sc.nextLine() ; 
            KhachHang kd = new KhachHang(hoTen , ma) ; 
            kd.chuanHoa();
            kd.tinhToan(line) ; 
            ds.add(kd) ; 
        }
        Collections.sort(ds) ; 
        for(KhachHang i : ds){
            System.out.println(i);
        }
    }
}
