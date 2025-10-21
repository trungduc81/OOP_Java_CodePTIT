package j07059;

public class CaThi implements Comparable<CaThi> {
    private String ma , ngay , gio , phong ; 

    public CaThi(String ma, String ngay, String gio, String phong) {
        this.ma = ma;
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    @Override
    public int compareTo(CaThi o) {
      if(this.ngay.equals(o.ngay)){
          if(this.gio.equals(o.gio)) return this.ma.compareTo(o.ma) ; 
          else return this.gio.compareTo(o.gio) ; 
      } 
      else return this.ngay.compareTo(o.ngay) ; 
    }
    
    @Override 
    public String toString(){
        return ma + " " + ngay + " " + gio + " " + phong ; 
    }   
}
