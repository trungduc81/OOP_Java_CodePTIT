import java.util.* ; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        MatHang[] a = new MatHang[n] ; 
        for(int i = 0 ; i < n ; i++){
            sc.nextLine() ; 
            a[i] = new MatHang(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()) ;
        }
        Arrays.sort(a,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getLoiNhuan() != o2.getLoiNhuan()) return o2.getLoiNhuan() - o1.getLoiNhuan() ; 
                return o1.getMaMatHang().compareTo(o2.getMaMatHang()) ; 
            }
        }) ;
        for(MatHang x : a){
            System.out.println(x);
        }
    }
}
