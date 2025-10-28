package j06009;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ;

class KhachHang {
    private String CusID , CusName , CusSex , CusDate , CusAddress ; 

    public KhachHang(String CusID, String CusName, String CusSex, String CusDate, String CusAddress) {
        this.CusID = CusID;
        this.CusName = CusName;
      this.CusDate = CusDate;
        this.CusAddress = CusAddress;
    }

    public String getCusID() {
        return CusID;
    }

    
    
    @Override 
    public String toString(){
        return CusName + " " + CusAddress  ;
    } 
}

class MatHang  {
    private String PrdID , PrdName , PrdNum ; 
    private int PrdBuy , PrdSell ; 

    public MatHang(String PrdID, String PrdName, String PrdNum, int PrdBuy, int PrdSell) {
        this.PrdID = PrdID;
        this.PrdName = PrdName;
        this.PrdNum = PrdNum;
        this.PrdBuy = PrdBuy;
        this.PrdSell = PrdSell;
    }   

    public String getPrdID() {
        return PrdID;
    }

    public int getPrdSell() {
        return PrdSell;
    }
    
    @Override 
    public String toString(){
        return PrdName + " " + PrdNum + " " + PrdBuy + " " + PrdSell ; 
    }
}

class HoaDon {
    private String BillId;
    private KhachHang kh ; 
    private MatHang mh ; 
    private int BillNum ; 
    private int thanhTien ; 

    public HoaDon(String BillId, KhachHang kh, MatHang mh, int BillNum) {
        this.BillId = BillId;
        this.kh = kh;
        this.mh = mh;
        this.BillNum = BillNum ;
        this.thanhTien = BillNum * mh.getPrdSell() ; 
    }
    
    
    @Override 
    public String toString() {
     return BillId + " " + kh + " " + mh + " " + BillNum + " " + thanhTien ; 
}
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in")) ;
        Scanner sc2 =  new Scanner(new File("MH.in")) ; 
        Scanner sc3 = new Scanner(new File("HD.in")) ; 
        
        int n = Integer.parseInt(sc1.nextLine()) ;  
        ArrayList<KhachHang> dskh = new ArrayList<>() ; 
        ArrayList<MatHang> dsmh = new ArrayList<>() ; 
        ArrayList<HoaDon> dshd = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String CusId = String.format("KH%03d",i) ; 
            dskh.add(new KhachHang(CusId , sc1.nextLine() , sc1.nextLine() , sc1.nextLine() , sc1.nextLine())) ; 
        }
        int  m = Integer.parseInt(sc2.nextLine()) ; 
        for(int i = 1 ; i <= m ; i++){
            String PrdId = String.format("MH%03d",i) ; 
            dsmh.add(new MatHang(PrdId , sc2.nextLine() , sc2.nextLine() , Integer.parseInt(sc2.nextLine()) , Integer.parseInt(sc2.nextLine()))) ; 
        }
        
        int p = Integer.parseInt(sc3.nextLine()) ; 
        for(int i = 1 ; i <= p ; i++){
            String HdID = String.format("HD%03d",i) ; 
            String KhID = sc3.next() ; 
            String MhID = sc3.next() ; 
            int sl = sc3.nextInt() ; 
            KhachHang tmp = null ; MatHang temp = null ; 
            for(KhachHang kh : dskh){
                if(KhID.equals(kh.getCusID())){
                    tmp = kh ; 
                    break ; 
                }
            }
            for(MatHang mh : dsmh){
                if(MhID.equals(mh.getPrdID())){
                    temp = mh ; 
                    break ; 
                }
            }
            dshd.add(new HoaDon(HdID ,tmp , temp , sl )) ; 
        }
        for(HoaDon hd : dshd){
            System.out.println(hd) ;
        }
    }   
}
