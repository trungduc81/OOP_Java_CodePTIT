import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();

        int minX = Math.min(Math.min(x1, x3), Math.min(x2, x4));
        int maxX = Math.max(Math.max(x1, x3), Math.max(x2, x4));
        int minY = Math.min(Math.min(y1, y3), Math.min(y2, y4));
        int maxY = Math.max(Math.max(y1, y3), Math.max(y2, y4));

        int w = maxX - minX;
        int h = maxY - minY;

        int canh = Math.max(w, h); 
        int s = canh * canh ; 
        System.out.println(s);
    }
}
