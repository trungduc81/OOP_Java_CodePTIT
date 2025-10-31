import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.* ; 

class Gamer implements Comparable<Gamer> {
    private String ma , hoTen , gioVao , gioRa ;
    private int soGio , soPhut ; 

    public Gamer(String ma, String hoTen, String gioVao, String gioRa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    
    public void xuly(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm") ; 
        LocalTime d1 = LocalTime.parse(gioVao) ; 
        LocalTime d2 = LocalTime.parse(gioRa) ; 
        this.soPhut = (int) ChronoUnit.MINUTES.between(d1, d2) % 60 ; 
        this.soGio = (int) ChronoUnit.HOURS.between(d1, d2) ; 
    }

    @Override
    public int compareTo(Gamer o) {
        if(this.soGio == o.soGio) return o.soPhut - this.soPhut ; 
        else return o.soGio - this.soGio ; 
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + soGio + " gio " + soPhut + " phut" ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<Gamer> ds = new ArrayList<>() ; 
        for(int i = 1 ; i<= n ;i++){
            Gamer g = new Gamer(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()) ; 
            g.xuly() ; 
            ds.add(g) ; 
        }
        Collections.sort(ds) ; 
        for(Gamer g : ds){
            System.out.println(g);
        }
    }
}
