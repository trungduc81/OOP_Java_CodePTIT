import java.util.*;

class Rectange {
    int x, y;
    String color;

    public Rectange(){} 

    void input(Scanner sc){
        this.x = sc.nextInt();
        this.y = sc.nextInt();
        String s = sc.next();
        this.color = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    void output(){
        if(this.x <= 0 || this.y <= 0){
            System.out.println("INVALID");
        } else {
            System.out.println((this.x + this.y) * 2 + " " + (this.x * this.y) + " " + this.color);
        }
    }
}

public class NewClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectange A = new Rectange();
        A.input(sc);
        A.output();
    }
}
