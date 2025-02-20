public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 mk1 = new MataKuliah07();
        mk1.kodeMK = "ALSD001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 4;
        mk1.jumlahJam = 240;

        System.out.println("=== Informasi Mata Kuliah 1 ===");
        mk1.tampilinInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(20);
        mk1.kurangiJam(50);
        System.out.println();
        
        mk1.tampilinInformasi();
        System.out.println();

        MataKuliah07 mk2 = new MataKuliah07("BD001", "Basis Data", 2, 120);
        System.out.println("=== Informasi Mata Kuliah 2 ===");
        mk2.tampilinInformasi();
    }
}
