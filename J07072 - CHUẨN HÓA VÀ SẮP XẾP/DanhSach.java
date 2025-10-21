package j07072;

public class DanhSach implements Comparable<DanhSach> {
    private String  tenDem = "" , ten , ho ; 
    
    public void xuly(String line){
        String[] arr = line.trim().split("\\s+") ; 
        for(int i = 0 ; i < arr.length ; i++){
            if(i==0) 
                this.ho = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() ;
            else if(i==arr.length - 1) 
                this.ten = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() ;
            else 
                this.tenDem += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() + " " ;
        }
        this.tenDem = this.tenDem.trim() ; 
    }

    @Override
    public int compareTo(DanhSach o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)) return this.tenDem.compareTo(o.tenDem) ; 
            else return this.ho.compareTo(o.ho) ; 
        }
        else return this.ten.compareTo(o.ten) ; 
    }
    
    @Override
    public String toString(){
        return ho + " " + tenDem + " " + ten ; 
    }
