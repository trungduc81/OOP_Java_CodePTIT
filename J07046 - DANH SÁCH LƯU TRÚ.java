import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ; 
import java.math.* ;  
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Khach implements Comparable<Khach> {
    private String ma , hoTen , maPhong , ngayDen , ngayDi  ; 
    private int soNgayLuuTru  ; 

    public Khach(String ma, String hoTen, String maPhong, String ngayDen, String ngayDi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
 
    }
    
    @Override
    public String toString(){
        return ma + " " + hoTen + " " + maPhong + " " + soNgayLuuTru ; 
    }

    @Override
    public int compareTo(Khach o) {
       return o.soNgayLuuTru - this.soNgayLuuTru ; 
    }
    
    public void xuly(){
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy") ; 
        LocalDate d1 = LocalDate.parse(ngayDen, dtf) ; 
        LocalDate d2 = LocalDate.parse(ngayDi , dtf) ; 
        this.soNgayLuuTru = (int) ChronoUnit.DAYS.between(d1,d2) ; 
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in")) ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        ArrayList<Khach> ds = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            String ma = String.format("KH%02d",i+1) ; 
            Khach khach = new Khach(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()) ; 
            khach.xuly();
            ds.add(khach) ; 
        }  
        Collections.sort(ds) ; 
        for(Khach i : ds){
            System.out.println(i);
        }
    }
}
