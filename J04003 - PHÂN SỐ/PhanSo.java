public class PhanSo{
    private long tu , mau ; 
    
    public long ucln(long a , long b){
        if(b==0) return a ; 
        else return ucln(b,a%b) ; 
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public void RutGon(){
        long gcd = ucln(this.tu , this.mau) ; 
        this.tu /= gcd ; 
        this.mau /= gcd ; 
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau ; 
    }      
}
