import java.util.* ;
import java.io.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("SV.in") ; 
        FileReader fr = new FileReader(f) ; 
        BufferedReader br = new BufferedReader(fr) ; 
        
        int n = Integer.parseInt(br.readLine()) ; 
        SinhVien[] ds = new SinhVien[n] ; 
        for(int i = 1 ; i <= n ; i++){
            String hoTen = br.readLine();
            String lop = br.readLine();
            String ngaySinh = br.readLine();
            float gpa = Float.parseFloat(br.readLine());
            String msv = String.format("%03d",i) ; 
            ds[i-1] = new SinhVien(msv, hoTen, ngaySinh, lop , gpa);
        }
        br.close() ; 
        for(SinhVien x : ds){
            System.out.println(x);
        }
    }
}
