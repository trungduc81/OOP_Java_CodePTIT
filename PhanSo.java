public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long ucln(long a, long b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }

    public void RutGon() {
        long gcd = ucln(tu, mau);
        tu /= gcd;
        mau /= gcd;
    }

    public PhanSo Cong(PhanSo other) {
        long gcd = ucln(this.mau, other.mau);
        long lcm = this.mau / gcd * other.mau;

        long tuMoi = this.tu * (lcm / this.mau) + other.tu * (lcm / other.mau);
        PhanSo kq = new PhanSo(tuMoi, lcm);
        kq.RutGon();
        return kq;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
