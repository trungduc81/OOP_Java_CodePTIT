package j07054;

public class BangDiem implements Comparable<BangDiem> {
    private String msv, hoTen;
    private float dtb;
    private int thuhang;

    public BangDiem(String msv, String hoTen, float d1, float d2, float d3) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.dtb = Float.parseFloat(String.format("%.2f", (float)(d1*3 + d2*3 + d3*2) / 8));
    }

    public int getThuhang() {
        return thuhang;
    }

    public void setThuhang(int thuhang) {
        this.thuhang = thuhang;
    }

    public void chuanHoa() {
        String[] temp = this.hoTen.trim().split("\\s+");
        String tmp = "";
        for (String s : temp) {
            tmp += Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase() + " ";
        }
        this.hoTen = tmp.trim();
    }

    public float getDtb() {
        return dtb;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public int compareTo(BangDiem x) {
        if (Float.compare(x.dtb, this.dtb) == 0)
            return this.msv.compareTo(x.msv); 
        return Float.compare(x.dtb, this.dtb); 
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + String.format("%.2f",dtb) + " " + thuhang;
    }
}
