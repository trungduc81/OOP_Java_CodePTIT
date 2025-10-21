package j07059;
import java.io.* ; 
import java.util.* ; 
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in")) ; 
        int n  = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<CaThi> ds = new ArrayList<>() ; 
        for(int i  = 1 ; i <= n ; i++){
            String ma = String.format("C%03d",i) ; 
            CaThi ct = new CaThi(ma , sc.nextLine(),sc.nextLine(),sc.nextLine()) ; 
            ds.add(ct) ; 
        }
        Collections.sort(ds) ; 
        for(CaThi i : ds){
            System.out.println(i);
        }
    }
}
