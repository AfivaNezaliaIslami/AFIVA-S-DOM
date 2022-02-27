package tugasSDA1;

import java.util.ArrayList;
public class removeTest {
    public static void main(String[] args) {
        ArrayList nama = new ArrayList();

        nama.add("L");
        nama.add("A");
        nama.add("M");
        nama.add("I");
        
        System.out.println("// Menghapus nilai pada indeks tertentu");
        System.out.println("Menghapus nilai pada indeks 0 = "+nama.remove(0));
        System.out.println(nama); 

        System.out.println("Menghapus nilai pada indeks 2 = "+nama.remove(2));
        System.out.println(nama); 

        System.out.println("Menghapus nilai pada indeks 3 = "+nama.remove(3));
        System.out.println(nama); 



        

    }
    
}
