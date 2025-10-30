import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ; 
import java.math.* ;  
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Online implements Comparable<Online> {
    private String hoTen , start , end  ; 
    private int thoiLuong ; 

    public Online(String hoTen, String start, String end) {
        this.hoTen = hoTen;
        this.start = start;
        this.end = end;
    }
    
    public void xuly(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss") ; 
        LocalDateTime d1 = LocalDateTime.parse(start, dtf) ; 
        LocalDateTime d2 = LocalDateTime.parse(end,dtf) ; 
        this.thoiLuong = (int) ChronoUnit.MINUTES.between(d1,d2) ; 
    }

    @Override
    public int compareTo(Online o) {
        if(o.thoiLuong == this.thoiLuong) return this.hoTen.compareTo(o.hoTen) ; 
        else return o.thoiLuong - this.thoiLuong ; 
    }
    
    @Override
    public String toString() {
        return hoTen + " " + thoiLuong ; 
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in")) ; 
        ArrayList<Online> ds = new ArrayList<>() ; 
        int n = Integer.parseInt(sc.nextLine()) ; 
        for(int i = 0 ; i < n  ;i++){
            Online ol = new Online(sc.nextLine(),sc.nextLine(),sc.nextLine()) ; 
            ol.xuly();
            ds.add(ol) ; 
        }
        Collections.sort(ds) ; 
        for(Online i : ds){
            System.out.println(i);
        }
    }
}
  

    
