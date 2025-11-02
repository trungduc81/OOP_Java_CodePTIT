import java.util.* ; 

class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma , ten  ; 
    private int ssv ; 

    public DoanhNghiep(String ma, String ten, int ssv) {
        this.ma = ma;
        this.ten = ten;
        this.ssv = ssv;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        if(this.ssv == o.ssv) return this.ma.compareTo(o.ma) ; 
        else return o.ssv - this.ssv ; 
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + ssv ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<DoanhNghiep> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = sc.nextLine() ; 
            String ten = sc.nextLine() ; 
            int ssv = Integer.parseInt(sc.nextLine()) ; 
            ds.add(new DoanhNghiep(ma,ten,ssv)) ; 
        }
        Collections.sort(ds) ; 
        for(DoanhNghiep i : ds){
            System.out.println(i);
        }
    }
}
