import java.util.*;

class Point {
    double x , y ; 

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point A){
        double x0 = this.x - A.x ; 
        double y0 = this.y - A.y ; 
        return Math.sqrt(x0*x0 + y0*y0) ; 
    }
}

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        while(t-- >0){
            double a = sc.nextDouble() , b = sc.nextDouble() , c = sc.nextDouble() , d = sc.nextDouble() ; 
            Point A = new Point(a,b) ; 
            Point B = new Point(c,d) ; 
            System.out.printf("%.4f",A.distance(B)) ; 
            System.out.println("");
        }
    }
}
