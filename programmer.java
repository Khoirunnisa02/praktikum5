public class programmer extends pegawai {
    double bonus;

    // Setter
    public programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    // Cetak
    @Override
    public void cetakInfo() {
        System.out.println("Programmer");
        super.cetakInfo();
        System.out.println("Bonus 		: " + getBonus() + "\n");
    }
}
