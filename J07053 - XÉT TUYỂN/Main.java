package j07053;

import java.io.* ; 
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("PH%02d",i) ; 
            String hoTen = sc.nextLine() ; 
            String ngaySinh = sc.nextLine() ; 
            float diemLT = Float.parseFloat(sc.nextLine()) ; 
            float diemTH = Float.parseFloat(sc.nextLine()) ; 
            XetTuyen xt = new XetTuyen(ma,hoTen,ngaySinh,diemLT,diemTH) ; 
            xt.chuanHoa() ; 
            xt.thuong();
            System.out.println(xt);
        }
    }
}
