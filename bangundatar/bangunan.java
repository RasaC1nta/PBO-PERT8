package bangundatar;
import java.util.Scanner;

// Superclass
class BangunDatar {
    public double luas() {
        return 0;
    }
}

// Subclass 1: Persegi Panjang
class PersegiPanjang extends BangunDatar {
    double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang * lebar;
    }
}

// Subclass 2: Segitiga Siku-Siku
class SegitigaSiku extends BangunDatar {
    double alas, tinggi; 
    
    public SegitigaSiku(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
}

// Subclass 3: Lingkaran 
class Lingkaran extends BangunDatar {
    double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }
    
    @Override
    public double luas() {
        return Math.PI * r * r;
    }
}


public class bangunan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //Persegi Panjang
        System.out.println("Masukkan Panjang:"); 
        double pPersegi = input.nextDouble();     
        System.out.println("Masukkan Lebar:");    
        double lPersegi = input.nextDouble();     
        
        BangunDatar persegiPanjang = new PersegiPanjang(pPersegi, lPersegi);
        System.out.println("Luas Persegi panjang adalah " + persegiPanjang.luas());  
        
        System.out.println("-------------------------");
        
        //segitiga
        System.out.println("Masukkan Panjang (Alas):");  
        double pSegitiga = input.nextDouble();           
        System.out.println("Masukkan Tinggi:");          
        double tSegitiga = input.nextDouble();           
        
         
        BangunDatar segitiga = new SegitigaSiku(pSegitiga, tSegitiga);
        System.out.println("Luas Segitiga siku-siku adalah " + segitiga.luas());  
        
        System.out.println("-------------------------");
        
        //lingkaran
        System.out.println("Masukkan Jari-jari Lingkaran:");
        double rLingkaran = input.nextDouble();
        
        BangunDatar lingkaran = new Lingkaran(rLingkaran);
        System.out.println("Luas Lingkaran adalah " + lingkaran.luas());
        
        input.close();
    }
}
