// Subclass lainnya
class Senapan extends Senjata {
    private double jarakTembak;

    public Senapan(String jenis, double berat, int panjang, double jarakTembak) {
        super(jenis, berat, panjang);
        this.jarakTembak = jarakTembak;
    }

    public void info() {
        super.info();
        System.out.println("Jarak Tembak: " + jarakTembak + " meter");
    }
}