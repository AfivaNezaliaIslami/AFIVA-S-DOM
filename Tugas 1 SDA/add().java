package tugasSDA1;
import java.util.ArrayList;
public class addTest {
    public static void main(String[] args) {
        ArrayList nama = new ArrayList();

        nama.add("L");
        nama.add("A");
        nama.add("M");
        nama.add("I");

        nama.add(0,"e");
        System.out.println(nama);

        nama.add(2,"f");
        System.out.println(nama);

        nama.add(3,"g");
        System.out.println(nama);

        nama.add(4,"h");
        System.out.println(nama);

        nama.add(6,"h");
        System.out.println(nama);

        nama.add(-3,"j");
        System.out.println(nama);      
        
        

    }    
        
}
