import java.util.* ; 

class NhapXuat {
    private String ma ; 
    private long xuat , nhap , tien , thue , donGia ; 

    public NhapXuat(String ma, long nhap) {
        this.ma = ma;
        this.nhap = nhap;
        
        char c1 = ma.charAt(0) , c2 = ma.charAt(ma.length()-1) ;
        if(c1=='A') xuat = Math.round(0.6 * nhap) ; 
        else xuat = Math.round(0.7 * nhap) ; 
        
        if(c2=='Y') donGia = 110000 ; else donGia = 135000 ; 
        
        tien = xuat * donGia ; 
        if(c1=='A' && c2=='Y') thue = 8 * tien / 100 ; 
        else if(c1=='A' && c2 =='N') thue = 11 * tien / 100 ; 
        else if(c1 == 'B' && c2 == 'Y') thue = 17 * tien / 100 ; 
        else thue = 22 * tien / 100 ; 
    }
    
    public String toString() {
        return ma + " " + nhap + " " + xuat + " " + donGia + " " + tien + " " + thue ; 
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        for(int i = 1 ; i <=n ; i++){
            NhapXuat nx = new NhapXuat(sc.next() , sc.nextLong()) ; 
            System.out.println(nx);
        }
    }
}
