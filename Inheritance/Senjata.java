// Superclass (kelas induk)
class Senjata {
    protected String jenis;
    protected double berat;
    protected int panjang;

    public Senjata(String jenis, double berat, int panjang) {
        this.jenis = jenis;
        this.berat = berat;
        this.panjang = panjang;
    }

    public void info() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Panjang: " + panjang + " cm");
    }
}