package j07058;
import java.io.* ; 
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<MonHoc> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            MonHoc mh = new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine()) ; 
            ds.add(mh) ; 
        }
        Collections.sort(ds) ; 
        for(MonHoc i : ds){
            System.out.println(i);
        }
    }
}
