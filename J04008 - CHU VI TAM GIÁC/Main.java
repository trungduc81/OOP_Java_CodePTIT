import java.util.* ; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-->0){
            float a1 = sc.nextFloat() , a2 = sc.nextFloat() ; 
            float b1 = sc.nextFloat() , b2 = sc.nextFloat() ;
            float c1 = sc.nextFloat() , c2 = sc.nextFloat() ;
            Point p1 = new Point(a1,a2) , p2 = new Point(b1,b2) , p3 = new Point(c1,c2) ; 
            float a = p1.distance(p2) , b = p2.distance(p3) , c = p3.distance(p1) ; 
            if(a+b <= c || a+c <= b || b+c <= a){
                System.out.println("INVALID");
            }
            else System.out.printf("%.3f\n",a+b+c);
        }
        
    }
    
}
