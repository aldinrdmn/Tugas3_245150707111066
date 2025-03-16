import java.util.Scanner;

public class MainPengiriman
{
    public static void main(String[] args) 
    {
        PengirimanBarang.displayInfoLogistik();

    //scanner input
        Scanner jamal = new Scanner(System.in);

        System.out.println("Masukan nama pengirim: ");
        String namaPengirim = jamal.nextLine();

        System.out.println("Masukan alamat pengiriman: ");
        String alamatTujuan = jamal.nextLine();

        System.out.println("Masukan berat barang(kg): ");
        double berat = jamal.nextDouble();

        System.out.println("Masukan biayaadasar: ");
        double biayaDasar = jamal.nextDouble();

        PengirimanBarang barang = new PengirimanBarang(namaPengirim, alamatTujuan, berat, biayaDasar);
    
    //display info
        System.out.println("\nInformasi barang:");
        barang.displayInfo();

    //inisialisasi
        System.out.print("\nMasukan diskon(dalam persen): ");
        double diskon = jamal.nextDouble();
        System.out.println("Ongkir dengan diskon " + diskon + "%: Rp " + barang.hitungOngkir(diskon));
        
        System.out.print("Masukkan biaya tambahan: ");
        double tambahan = jamal.nextDouble();
        System.out.println("Ongkir dengan diskon " + diskon + "% dan biaya tambahan Rp " + tambahan + ": Rp " + barang.hitungOngkir(diskon, tambahan));

        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarakPengiriman = jamal.nextInt();
        System.out.println("Ongkir berdasarkan jarak " + jarakPengiriman + " km: Rp " + barang.hitungOngkir(jarakPengiriman));
    
        jamal.close();
    }
}