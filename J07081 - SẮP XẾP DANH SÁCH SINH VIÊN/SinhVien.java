package j07081;

public class SinhVien implements Comparable<SinhVien> {
    private String msv , ho , tenDem = "" , ten , sdt , email ; 

    public SinhVien(String msv, String line, String sdt, String email) {
        this.msv = msv ; 
        this.sdt = sdt;
        this.email = email;
        String[] arr = line.trim().split("\\s+") ; 
        for(int i = 0 ; i < arr.length ; i++){
            if(i==0) this.ho = arr[i] ; 
            else if(i == arr.length - 1) this.ten = arr[i] ; 
            else this.tenDem += arr[i] + " " ; 
        }
        this.tenDem = this.tenDem.trim() ; 
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)){
                if(this.tenDem.equals(o.tenDem)) return this.msv.compareTo(o.msv) ; 
                else return this.tenDem.compareTo(o.tenDem) ; 
            }
            else return this.ho.compareTo(o.ho) ; 
        }
        else return this.ten.compareTo(o.ten) ; 
    }
    
    @Override
    public String toString(){
        return msv + " " + ho + " " + tenDem + " " + ten + " " + sdt + " " + email ; 
    }
}
