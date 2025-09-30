import java.util.* ; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        ThoiGian[] a = new ThoiGian[n] ; 
        for(int i = 0 ; i < n ; i++){
            a[i] = new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt()) ; 
        }
        Arrays.sort(a,new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if (o1.getGio() != o2.getGio()) return o1.getGio() - o2.getGio();
                if (o1.getPhut() != o2.getPhut()) return o1.getPhut() - o2.getPhut();
                return o1.getGiay() - o2.getGiay();
            } 
        }) ; 
        for(ThoiGian x : a){
            System.out.println(x);
        }
        
    }
}
