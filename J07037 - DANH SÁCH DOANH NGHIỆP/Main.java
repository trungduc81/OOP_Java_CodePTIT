import java.io.* ;
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("DN.in") ; 
        BufferedReader br = new BufferedReader(new FileReader(f)) ; 
        int n = Integer.parseInt(br.readLine()) ; 
        DoanhNghiep[] ds = new DoanhNghiep[n] ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = br.readLine() ; 
            String ten = br.readLine() ; 
            int stc = Integer.parseInt(br.readLine()) ; 
            ds[i-1] = new DoanhNghiep(ma,ten,stc) ; 
        }
        br.close() ; 
        Arrays.sort(ds,new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                return o1.getMa().compareTo(o2.getMa()) ; 
            }  
        }) ; 
        for(DoanhNghiep x : ds){
            System.out.println(x);
        }
    }  
}
