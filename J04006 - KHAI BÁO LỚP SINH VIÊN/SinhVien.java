public class SinhVien {
    private String  name , date , lop ; 
    private float gpa ; 

    public SinhVien( String name, String date, String lop, float gpa) {
        this.name = name;
        this.date = date;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public static String ChuanHoa(String a){
    String[] arr = a.trim().split("/"); 
    String ngay = arr[0];
    String thang = arr[1];
    String nam = arr[2];
    if(ngay.length() == 1) ngay = "0" + ngay ;
    if(thang.length() == 1) thang = "0" + thang ;
    return ngay + "/" + thang + "/" + nam ;
    } 

    @Override
    public String toString() {
        return "B20DCCN001" + " " + this.name + " " + this.lop + " " + this.date + " " + String.format("%.2f",this.gpa) ;
    }
 
}
