package praktikum.modul1;

public class Mobil {
    
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    //konstruktor
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
        rubahkecepatan(kecepatan);
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
        this.waktu = rubahSekon(waktu);
    }

    //behaviour
    // Method untuk merubah waktu dari jam ke detik
    public double rubahSekon(double waktu) {
        return this.waktu * 3600;
    }

    // Method untuk merubah kecepatan dari km/jam ke m/s    
    public double rubahkecepatan(double kecepatanms) {
        kecepatan = kecepatanms * 3.6;
        return kecepatan;
    }

    // Method untuk menghitung jarak
    public double hitungJarak(double waktu, double kecepatan) {
        return kecepatan * waktu;
    }

    // Method untuk menampilan pesan
    public void displayMessage() {
        System.out.println("\nMobil anda bermerek = " + manufaktur);
        System.out.println("dan mampu menempuh kecepatan = " + kecepatan + " m/s");
        System.out.println("serta memililki warna = " + warna);
        System.out.println("mempunyai nomor plat = " + noPlat);
        System.out.printf("Mampu menempuh waktu selama = %.2f sekon\n", waktu);
        System.out.printf("Jarak yang ditempuh = %.1f km\n",hitungJarak(waktu, kecepatan)/1000);
    }
}