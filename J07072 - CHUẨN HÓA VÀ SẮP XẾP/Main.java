package j07072;
import java.io.* ; 
import java.util.* ; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in")) ; 
        ArrayList<DanhSach> list = new ArrayList<>() ; 
        while(sc.hasNextLine()){
            DanhSach ds = new DanhSach() ; 
            ds.xuly(sc.nextLine()) ; 
            list.add(ds) ; 
        }
        Collections.sort(list) ; 
        for(DanhSach i : list){
            System.out.println(i);
        }
    }
}
