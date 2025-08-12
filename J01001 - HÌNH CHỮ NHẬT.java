import java.util.Scanner ; 

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int a = sc.nextInt() , b = sc.nextInt() ; 
        if(a<=0 || b <= 0) System.out.println("0"); 
        else {
            int p = 2 * (a+b) ; 
            int s = a*b ;
            System.out.println(p + " " + s);
        }
    }
}
