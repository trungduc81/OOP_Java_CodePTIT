package j07081;
import java.util.* ;   
import java.io.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<SinhVien> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ; 
        }
        Collections.sort(ds) ; 
        for(SinhVien i : ds){
            System.out.println(i);
        }
    }
}
