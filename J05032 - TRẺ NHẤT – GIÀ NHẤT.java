import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.* ; 

class Person implements Comparable<Person> {
    private String ten , ngaySinh ; 
    private int soNgay ; 

    public Person(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy") ; 
        LocalDate d1 = LocalDate.now() ; 
        LocalDate d2 = LocalDate.parse(this.ngaySinh,dtf) ; 
        this.soNgay = (int) ChronoUnit.DAYS.between(d2,d1) ; 
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(Person o) {
        return this.soNgay - o.soNgay ; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; sc.nextLine() ; 
        ArrayList<Person> ds = new ArrayList<>() ; 
        for(int i = 1 ; i <= n ; i++){
            String[] arr = sc.nextLine().trim().split("\\s+") ; 
            ds.add(new Person(arr[0],arr[1])) ; 
        }
        Collections.sort(ds) ; 
        System.out.println(ds.get(0).getTen());
        int idx = ds.size() - 1 ; 
        System.out.println(ds.get(idx).getTen()) ;
    }
}



