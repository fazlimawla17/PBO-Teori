// Subclass (kelas turunan)
class Pistol extends Senjata {
    private int kapasitasMagazine;

    public Pistol(String jenis, double berat, int panjang, int kapasitasMagazine) {
        super(jenis, berat, panjang);
        this.kapasitasMagazine = kapasitasMagazine;
    }

    public void info() {
        super.info();
        System.out.println("Kapasitas Magazine: " + kapasitasMagazine + " butir");
    }
}