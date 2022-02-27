package tugasSDA1;

import java.util.ArrayList;
public class getTest {
     public static void main(String[] args) {
        ArrayList nama = new ArrayList();

        nama.add("L");
        nama.add("A");
        nama.add("M");
        nama.add("I");

        System.out.println("// Mengambil elemen pada indeks tertentu");
        System.out.println("Elemen [0] = "+nama.get(0));
        System.out.println("Elemen [2] = "+nama.get(2));
        System.out.println("Elemen [6] = "+nama.get(6));
        System.out.println("Elemen [-3] = "+nama.get(-3));
        
    }
    
}
