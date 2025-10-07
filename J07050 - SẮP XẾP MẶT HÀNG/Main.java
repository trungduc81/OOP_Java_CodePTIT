package j07050;

import java.io.* ; 
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<MatHang> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ten = sc.nextLine() ; 
            String nhom = sc.nextLine() ; 
            float giaMua = Float.parseFloat(sc.nextLine()) ; 
            float giaBan = Float.parseFloat(sc.nextLine()) ; 
            ds.add(new MatHang(ten,nhom,giaMua,giaBan)) ; 
        }
        Collections.sort(ds);
        for(MatHang x : ds){
            System.out.println(x);
        }
    }
}
