package factorypattern.makanan;

public class NasiUduk implements Makanan {
    private String namaMakanan = NasiUduk.class.getSimpleName();
    @Override
    public void harga() {
        System.out.println(namaMakanan+" Rp. 5000 murah meriah bos");
    }
}
