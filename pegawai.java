public class pegawai {
    String nama;
    double gajiPokok;

    // Setter
    public pegawai(String nama2, double gajiPokok2) {
    }

    public void pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Getter
    public String getNama() {
        return this.nama;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    // Cetak
    public void cetakInfo() {
        System.out.println("Nama 		: Andi Herlambang" + getNama());
        System.out.println("Gaji Pokok 	: 6000000" + getGajiPokok());
    }
}
