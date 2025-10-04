package j07033;

import java.io.* ;
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("SINHVIEN.in") ; 
        BufferedReader br = new BufferedReader(new FileReader(f)) ; 
        int n = Integer.parseInt(br.readLine()) ; 
        SinhVien[] ds = new SinhVien[n] ; 
        for(int i = 1 ; i <= n ; i++){
            String msv = br.readLine() ; 
            String hoTen = br.readLine() ; 
            String lop = br.readLine() ; 
            String email = br.readLine() ; 
            ds[i-1] = new SinhVien(msv,hoTen,lop,email) ; 
            ds[i-1].chuanHoa() ;   
        }
        br.close() ; 
        Arrays.sort(ds,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMsv().compareTo(o2.getMsv()) ; 
            }  
        }) ; 
        for(SinhVien x : ds){
            System.out.println(x);
        }
    }  
}
