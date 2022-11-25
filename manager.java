public class manager extends pegawai {
    double tunjangan;

    // Setter
    public manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Getter
    public double getTunjangan() {
        return this.tunjangan;
    }

    // Cetak
    @Override
    public void cetakInfo() {
        System.out.println("Manager");
        super.cetakInfo();
        System.out.println("Tunjangan 	: " + getTunjangan() + "\n");
    }
}
