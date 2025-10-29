import java.util.* ; 
import java.math.* ; 

class Point {
    private float a , b ;

    public Point(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Point() {
    }

    public static Point nextPoint(Scanner sc){
        Point p = new Point();
        p.a = sc.nextFloat();
        p.b = sc.nextFloat();
        return p;
    }
    
    public float distance(Point x){
        float d1 = this.a - x.a ; 
        float d2 = this.b - x.b ; 
        return (float) Math.sqrt(d1*d1 + d2*d2) ; 
    }
    
}

class Triangle {
    private Point a , b , c ; 
    private float chuVi ; 

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        float d1 = this.a.distance(this.b) ; 
        float d2 = this.b.distance(this.c) ; 
        float d3 = this.c.distance(this.a) ; 
        if(d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) return false ; 
        else {
            this.chuVi = d1 + d2 + d3 ; 
            return true ; 
        }
    }
    
    public String getPerimeter(){
        return String.format("%.3f",chuVi) ; 
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
    public static void main3109959(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
