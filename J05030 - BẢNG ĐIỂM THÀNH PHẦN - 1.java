import java.util.* ; 

class BangDiem implements Comparable<BangDiem> {
    private String msv , hoTen , lop ; 
    private float d1 , d2 ,d3 ; 

    public BangDiem(String msv, String hoTen, String lop, float d1, float d2, float d3) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public int compareTo(BangDiem o) {
        return this.msv.compareTo(o.msv) ; 
    }
    
    @Override
    public String toString(){
        return msv + " " + hoTen + " " + lop + " " + String.format("%.1f %.1f %.1f",d1,d2,d3) ; 
    }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<BangDiem> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            BangDiem bd = new BangDiem(sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())) ; 
            ds.add(bd) ; 
        }
        Collections.sort(ds) ; 
        for(int i = 0 ; i < ds.size() ; i++){
            System.out.printf("%d ",i+1);
            System.out.println(ds.get(i));
        }
    }
}
