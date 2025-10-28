import java.util.*; 

class PhanSo {
    private long tu, mau; 

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }
    
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private void rutGon(){
        long g = gcd(Math.abs(tu), Math.abs(mau));
        tu /= g;
        mau /= g;
    }

    public PhanSo cong(PhanSo x){
        long tuMoi = this.tu * x.mau + x.tu * this.mau;
        long mauMoi = this.mau * x.mau;
        return new PhanSo(tuMoi, mauMoi);
    }

    public PhanSo nhan(PhanSo x){
        long tuMoi = this.tu * x.tu;
        long mauMoi = this.mau * x.mau;
        return new PhanSo(tuMoi, mauMoi);
    }

    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong(), b = sc.nextLong();
            long c = sc.nextLong(), d = sc.nextLong();
            PhanSo x1 = new PhanSo(a,b);
            PhanSo x2 = new PhanSo(c,d);

            PhanSo tong = x1.cong(x2); 
            PhanSo C = tong.nhan(tong); 
            PhanSo D = x1.nhan(x2).nhan(C); 
            System.out.println(C + " " + D);
        }
    }
}
