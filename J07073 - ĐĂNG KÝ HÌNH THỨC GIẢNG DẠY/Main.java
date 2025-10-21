package j07073;
import java.io.* ; 
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<MonHoc> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            ds.add(new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())) ; 
        }
        ArrayList<MonHoc> res = new ArrayList<>() ; 
        for(MonHoc i : ds){
            if(!i.getTh().equals("Truc tiep"))
                res.add(i) ; 
        }
        Collections.sort(res) ; 
        for(MonHoc i : res){
            System.out.println(i);
        }
        
    }
}
