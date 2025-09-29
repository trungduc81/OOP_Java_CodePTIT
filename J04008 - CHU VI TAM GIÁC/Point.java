public class Point {
    private float a,b; 

    public Point(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public float distance(Point p){
        float d1 = this.a - p.a ; 
        float d2 = this.b - p.b ; 
        return (float) Math.sqrt(d1*d1 + d2*d2) ;  
    }   
}
