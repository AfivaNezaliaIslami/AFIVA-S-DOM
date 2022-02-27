package tugasSDA1;

import java.util.ArrayList;
public class indexOf {
    public static void main(String[] args) {
        ArrayList nama = new ArrayList();

        nama.add("L");
        nama.add("A");
        nama.add("M");
        nama.add("I");

        System.out.println("// Mengetahui indeks dari suatu nilai");
        System.out.println("Indeks dari a :"+nama.indexOf("a"));
        System.out.println("Indeks dari c :"+nama.indexOf("c"));
        System.out.println("Indeks dari q :"+nama.indexOf("q"));

    }
}
