public class ThiSinh {
    private String name , date  ; 
    private double diem1 , diem2 , diem3 , tong ; 

    public ThiSinh(String name, String date, double diem1, double diem2, double diem3) {
        this.name = name;
        this.date = date;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = this.diem1 + this.diem2 + this.diem3 ; 
    }

    @Override
    public String toString() {
        return this.name + " " + this.date + " " + String.format("%.1f",this.tong) ;
    }  
}
