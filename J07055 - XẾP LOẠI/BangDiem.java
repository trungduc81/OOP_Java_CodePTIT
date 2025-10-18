package j07055;

public class BangDiem implements Comparable<BangDiem> {
    private String msv, hoTen;
    private float tongKet;
    private String xepLoai;

    public BangDiem(String msv, String hoTen, float lt, float th, float thi) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.tongKet =  (float)(lt*0.25 + th*0.35 + thi*0.4);
        this.xepLoai = xepLoai();
    }

    private String xepLoai() {
        if (tongKet >= 8.0) return "GIOI";
        else if (tongKet >= 6.5) return "KHA";
        else if (tongKet >= 5.0) return "TRUNG BINH";
        else return "KEM";
    }

    public void chuanHoa() {
        String[] temp = this.hoTen.trim().split("\\s+");
        String tmp = "";
        for (String s : temp) {
            tmp += Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase() + " ";
        }
        this.hoTen = tmp.trim();
    }

    public float getTongKet() {
        return tongKet;
    }

    @Override
    public int compareTo(BangDiem x) {
        return Float.compare(x.tongKet, this.tongKet); // giảm dần
    }

    @Override
    public String toString() {
        return msv + " " + hoTen + " " + String.format("%.2f", tongKet) + " " + xepLoai;
    }
}
