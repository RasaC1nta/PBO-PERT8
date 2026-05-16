public class MainOverload {

    
    public static void main(String[] args) {
        System.out.println("Mulai Eksekusi dari Main Utama");
        
        main(10); 
        
        
        //main("Praktikum PBO"); 

        
        main("Test Overload", 99);

        
        
        System.out.println("Eksekusi Selesai");
    }

    
    // Overloaded method 1: Parameter int
    public static void main(int angka) {
        System.out.println("Overloaded main (int) dieksekusi. Nilai: " + angka);
    }

    // Overloaded method 2: Parameter String tunggal
    public static void main(String teks) {
        System.out.println("Overloaded main (String) dieksekusi. Teks: " + teks);
    }

    // Overloaded method 3: Parameter String dan int
    public static void main(String teks, int angka) {
        System.out.println("Overloaded main (String, int) dieksekusi. Data: " + teks + " & " + angka);
    }
}
