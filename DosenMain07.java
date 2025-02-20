public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 dosen1 = new Dosen07();
        dosen1.idDosen = "DSN001";
        dosen1.nama = "Dr. Andi Wijaya";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        System.out.println("=== Informasi Dosen 1 ===");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Bisnis");

        System.out.println();
        dosen1.tampilInformasi();
        System.out.println();
        
        Dosen07 dosen2 = new Dosen07("DSN002", "Prof. Siti Aminah", true, 2015, "Problem Solving");
        System.out.println("=== Informasi Dosen 2 ===");
        dosen2.tampilInformasi();
    }
}
