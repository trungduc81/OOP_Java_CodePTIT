import java.io.* ;
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("MONHOC.in") ; 
        BufferedReader br = new BufferedReader(new FileReader(f)) ; 
        int n = Integer.parseInt(br.readLine()) ; 
        MonHoc[] ds = new MonHoc[n] ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = br.readLine() ; 
            String ten = br.readLine() ; 
            int stc = Integer.parseInt(br.readLine()) ; 
            ds[i-1] = new MonHoc(ma,ten,stc) ; 
        }
        br.close() ; 
        Arrays.sort(ds,new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTen().compareTo(o2.getTen()) ; 
            }  
        }) ; 
        for(MonHoc x : ds){
            System.out.println(x);
        }
    }  
}
