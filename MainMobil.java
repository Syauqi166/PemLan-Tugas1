package praktikum.modul1;
import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
    
    //untuk input user
    Scanner input = new Scanner(System.in);

    //instan objek bernama m1
    Mobil m1 = new Mobil();
    System.out.print("Masukkan Manufaktur : ");
    m1.setManufaktur(input.nextLine());
    System.out.print("Masukkan Kecepatan : ");
    m1.setKecepatan(input.nextInt());
    input.nextLine();
    System.out.print("Masukkan Warna : ");
    m1.setWarna(input.nextLine());
    System.out.print("Masukkan No Plat : ");
    m1.setNoPlat(input.nextLine());
    System.out.print("Masukkan Waktu Tempuh : ");
    m1.setWaktu(input.nextDouble());
    m1.displayMessage();
    System.out.println("================");

    //instan objek baru bernama m2
    Mobil m2 = new Mobil();
    m2.setKecepatan(100);
    m2.setManufaktur("Mitsubishi");
    m2.setNoPlat("N 1134 AG");
    m2.setWarna("Pink");
    m2.displayMessage();
    System.out.println("================");

    //merubah warna dari objek m1
    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");

    m1.setWarna("Hijau");
    //menampilkan hasil perubahan
    m1.displayMessage();
    
    input.close();
    } 
}