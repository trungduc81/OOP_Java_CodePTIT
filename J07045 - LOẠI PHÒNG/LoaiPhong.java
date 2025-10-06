public class LoaiPhong implements Comparable<LoaiPhong> {
    private String line , ten  ; 

    public LoaiPhong(String line) {
       this.ten = line.split("\\s+")[1] ; 
       this.line = line ; 
    }

    @Override
    public int compareTo(LoaiPhong x) {
       return this.ten.compareTo(x.ten) ; 
    }
    
    @Override 
    public String toString(){
        return line ; 
    }
    
}
