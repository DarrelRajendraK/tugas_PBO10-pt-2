package pbo9;

public class VirtualDemo {
    public static void main (String[] args){
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji ("jamal", "Samarinda", 2, 2500.00);
       Pegawai z = new Gaji ("udin", "Solok", 1, 5000.00);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        System.out.println(s.x);
        s.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(e.x);
        e.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(z.x);
        z.mailCheck();
        
    }
}
