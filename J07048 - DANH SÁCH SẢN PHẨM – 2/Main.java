package j07048;

import java.util.* ; 
import java.io.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<SanPham> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = sc.nextLine() ;
            String ten = sc.nextLine() ; 
            int gia = Integer.parseInt(sc.nextLine()) ; 
            int thoiHan = Integer.parseInt(sc.nextLine()) ; 
            ds.add(new SanPham(ma,ten,gia,thoiHan)) ; 
        }
        Collections.sort(ds) ;
        for(SanPham x : ds){
            System.out.println(x);
        }    
    }
}
