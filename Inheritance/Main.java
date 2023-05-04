public class Main {
    public static void main(String[] args) {
        Pistol pistol = new Pistol("Pistol Serbu", 1.5, 20, 17);
        pistol.info();
        System.out.println();

        Senapan senapan = new Senapan("Senapan Serbu", 4.2, 100, 800);
        senapan.info();
    }
}