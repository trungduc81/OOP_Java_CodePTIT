import java.util.* ; 

class GiangVien  {
    private String hoTen , boMon = "" , ten , ma ; 

    public GiangVien(String ma ,String hoTen, String boMon) {
        this.ma = ma ; 
        this.hoTen = hoTen;
        
        String[] a = boMon.split("\\s+") ; 
        for(int i = 0 ; i< a.length ; i++){
            this.boMon += Character.toUpperCase(a[i].charAt(0)) ; 
        }
        
        String[] arr = hoTen.split("\\s+") ; 
        this.ten = arr[arr.length - 1] ; 
    }

    public String getHoTen() {
        return hoTen;
    }


    @Override
    public String toString() {
        return ma + " " + hoTen + " " + boMon ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<GiangVien> ds = new ArrayList<>() ; 
        for(int i = 1 ; i<= n ; i++){
            String ma = String.format("GV%02d",i) ; 
            ds.add(new GiangVien(ma,sc.nextLine(),sc.nextLine())) ;
        }
        int q = sc.nextInt() ; sc.nextLine() ; 
        String[] truy_van = new String[q] ; 
        for(int i = 0 ; i < q ; i++) truy_van[i] = sc.nextLine() ; 
        for(int i = 0 ; i< q ; i++){
            String tuKhoa = truy_van[i] ; 
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tuKhoa + ":");
            for(GiangVien gv : ds){
                if(gv.getHoTen().toUpperCase().contains(tuKhoa.toUpperCase())){
                    System.out.println(gv);
                }
            }
        }
    }
}




 
