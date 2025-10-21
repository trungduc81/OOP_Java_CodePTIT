import java.io.* ; 
import java.util.* ; 

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in")) ; 
        int t = Integer.parseInt(sc.nextLine()) ; 
        while(t-->0){
            String[] arr = sc.nextLine().trim().split("\\s+") ; 
            int n = Integer.parseInt(arr[0]) ; 
            int m = Integer.parseInt(arr[1]) ;
            int k = Integer.parseInt(arr[2]) ;
            List<Integer> list = new ArrayList<>() ; 
            int[][] a = new int[n+1][m+1] ; 
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= m ; j++){
                    a[i][j] = sc.nextInt() ; 
                    if(j==k) list.add(a[i][j]) ; 
                }
            }
            if(sc.hasNextLine()) sc.nextLine();
            int idx = 0 ; 
            Collections.sort(list);
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= m ; j++){
                     if(j==k) System.out.printf(list.get(idx++)+ " ");
                     else System.out.printf(a[i][j]+ " ");
                }
                System.out.println("");
            }
            
        }
    }
}
