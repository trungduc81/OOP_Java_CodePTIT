package j07057;
import java.io.* ; 
import java.util.* ; 
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<ThiSinh> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("TS%02d",i) ; 
            String hoTen = sc.nextLine() ; 
            float diem = Float.parseFloat(sc.nextLine()) ; 
            String danToc = sc.nextLine() ; 
            String khuVuc = sc.nextLine() ;
            ThiSinh ts = new ThiSinh(hoTen , danToc,khuVuc,diem,ma) ; 
            ts.chuanHoa() ; 
            ts.tinhToan() ; 
            ds.add(ts) ;
        }
        Collections.sort(ds) ; 
        for(ThiSinh i : ds){
            System.out.println(i);
        }
    }
}
