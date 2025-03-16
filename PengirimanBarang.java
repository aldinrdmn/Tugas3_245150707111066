public class PengirimanBarang {
    public String namaPengirim;
    public String alamatTujuan;
    public double berat;
    public double biayaDasar;

    public PengirimanBarang()
    {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    public PengirimanBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar)
    {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    public double hitungOngkir(double diskonPersen)
    {
        return biayaDasar - (biayaDasar*diskonPersen/100);
    }

    public double hitungOngkir(double diskonPersen, double biayaTambahan)
    {
        return biayaDasar - (biayaDasar * diskonPersen / 100) + biayaTambahan;
    }
    
    public double hitungOngkir(int jarak)
    {   
        if(jarak>50)
        {
            return biayaDasar + (biayaDasar * 10 /100);
        }
        else 
        {
            return biayaDasar - (biayaDasar * 5/100);
        }
    }

    public static void displayInfoLogistik() 
    {   System.out.println("-----------------------------------------------------------");
        System.out.println("BedutGo - Mengantarkan dengan Cepat!(keamanan opsional ;D )");
        System.out.println("-----------------------------------------------------------");
    }

    public void displayInfo() 
    {
        System.out.println("====================================");
        System.out.printf("%-15s: %s%n", "Nama Pengirim", namaPengirim);
        System.out.printf("%-15s: %s%n", "Alamat Tujuan", alamatTujuan);
        System.out.printf("%-15s: %.2f kg%n", "Berat", berat);
        System.out.printf("%-15s: Rp %.2f%n", "Biaya Dasar", biayaDasar);
        System.out.println("====================================");
    }
}
