package j07054;
import java.io.* ; 
import java.util.* ; 
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<BangDiem> ds = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            String ma = String.format("SV%02d",i+1) ; 
            String hoTen = sc.nextLine() ; 
            float d1 = Float.parseFloat(sc.nextLine()) ; 
            float d2 = Float.parseFloat(sc.nextLine()) ; 
            float d3 = Float.parseFloat(sc.nextLine()) ; 
            BangDiem bd = new BangDiem(ma,hoTen,d1,d2,d3) ; 
            bd.chuanHoa() ;
            ds.add(bd) ; 
        }
        Collections.sort(ds) ; 
        int rank = 1 ; 
        ds.get(0).setThuhang(rank);
        for(int i = 1 ; i < ds.size() ; i++){
            if(Math.abs(ds.get(i).getDtb() - ds.get(i-1).getDtb()) < 1e-6){
                ds.get(i).setThuhang(rank);
            }
            else {
                rank = i + 1 ; 
                ds.get(i).setThuhang(rank) ; 
            }
        }
        for(BangDiem x : ds){
            System.out.println(x);
        }
    }
}
