import java.util.* ; 

class GiangVien implements Comparable<GiangVien> {
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

    @Override
    public int compareTo(GiangVien o) {
        if(this.ten.equals(o.ten)) return this.ma.compareTo(o.ma) ; 
        else return this.ten.compareTo(o.ten) ; 
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
        Collections.sort(ds) ; 
        for(GiangVien i : ds){
            System.out.println(i);
        }
    }
}

        



 
