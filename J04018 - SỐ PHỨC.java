import java.util.* ; 
import java.math.* ; 

class Complex {
    private int real , image ; 

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    
    public Complex cong(Complex x){
        int new_real = x.real + this.real ; 
        int new_image = x.image + this.image ; 
        return new Complex(new_real , new_image) ; 
    }
    
    public Complex nhan(Complex x){
        int new_real = x.real * this.real - this.image * x.image ; 
        int new_image = x.real * this.image + this.real * x.image ;
        return new Complex(new_real , new_image) ; 
    }
    
    @Override
    public String toString(){
        if(image > 0 ) return real + " + " + image + "i" ; 
        else return real + " - " + Math.abs(image) + "i" ; 
    }
 }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- > 0){
            Complex x1 = new Complex(sc.nextInt() , sc.nextInt()) ; 
            Complex x2 = new Complex(sc.nextInt() , sc.nextInt()) ; 
            Complex tong = x1.cong(x2) ; 
            Complex C = tong.nhan(x1) ; 
            Complex D = tong.nhan(tong) ; 
            System.out.println(C + ", " + D);
        }
    }
}
