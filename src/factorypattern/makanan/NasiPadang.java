package factorypattern.makanan;

public class NasiPadang implements Makanan {
    private String namaMakanan = NasiPadang.class.getSimpleName();
    @Override
    public void harga() {
        System.out.println(namaMakanan+" Rp. 15.000 mantap pisan");
    }
}
