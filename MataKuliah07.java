public class MataKuliah07 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah07() {

    }

    public MataKuliah07(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilinInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);  
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasi diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Penambahan jam berhasil!");
        System.out.println("Total jam sekarang: " + + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam - jam >= 0) {
            jumlahJam -= jam;
            System.out.println("Pengurangan jam berhasil!");
            System.out.println("Total jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam gagal! Jumlah jam tidak mencukupi.");
        }
    }
}
