import java.util.*;

public class NewClass {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        sc.nextLine() ; 
        while(t-->0){
           Set<String> se1 = new TreeSet<>() , se2 = new TreeSet<>() ; 
           String s1 = sc.nextLine() , s2 = sc.nextLine() ; 
           se1.addAll(Arrays.asList(s1.trim().split("\\s+"))) ; 
           se2.addAll(Arrays.asList(s2.trim().split("\\s+"))) ;
           for(String tmp : se1){
               if(!se2.contains(tmp)){
                   System.out.print(tmp + " ");
               }
           }
           System.out.println("");
           
        }
    }
}
