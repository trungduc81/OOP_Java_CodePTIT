import java.util.* ; 

class ThiSinh implements Comparable<ThiSinh> {
    private String ma , hoTen , ngaySinh ; 
    private float d1 , d2 ,d3 ,tong ; 

    public ThiSinh(String ma, String hoTen , String ngaySinh, float d1, float d2, float d3) {
        this.ma = ma;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = this.d1 + this.d2 + this.d3 ; 
        this.hoTen = hoTen ; 
    }

    public float getTong() {
        return tong;
    }
    
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + ngaySinh + " " + tong ; 
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(Float.compare(this.tong,o.tong)==0) return this.ma.compareTo(o.ma) ; 
        else return Float.compare(o.tong,this.tong) ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<ThiSinh> ds = new ArrayList<>() ; 
        for(int i = 1 ; i<= n ; i++){
            String ma = String.format("%d",i) ; 
            ds.add(new ThiSinh(ma,sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat())) ; 
            sc.nextLine() ; 
        }
        Collections.sort(ds) ; 
        int idx = -1 ; 
        for(int i = 0 ; i < ds.size() - 1 ; i++){
            if(ds.get(i).getTong() != ds.get(i+1).getTong()){
                idx = i+1 ; 
                break ; 
            }
        }
        for(int i = 0 ; i < idx ; i++){
            System.out.println(ds.get(i));
        }
    }
}
