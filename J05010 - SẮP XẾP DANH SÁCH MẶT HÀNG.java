import java.util.* ; 

class MatHang implements Comparable<MatHang> {
    private String ma , ten , nhom ; 
    private float giaMua , giaBan , loiNhuan ; 

    public MatHang(String ma, String ten, String nhom, float giaMua, float giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua ; 
    }

    @Override
    public int compareTo(MatHang o) {
        return Float.compare(o.loiNhuan , this.loiNhuan) ; 
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f",loiNhuan) ; 
    }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<MatHang> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String ma = String.format("%d",i) ; 
            ds.add(new MatHang(ma,sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat())) ; 
            sc.nextLine() ; 
        }
        Collections.sort(ds) ; 
        for(MatHang i : ds){
            System.out.println(i);
        }
    }
}
