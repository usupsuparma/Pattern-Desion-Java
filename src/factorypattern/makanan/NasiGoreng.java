package factorypattern.makanan;

public class NasiGoreng implements Makanan {
    private String namaMakanan = NasiGoreng.class.getSimpleName();
    @Override
    public void harga() {
        System.out.println(namaMakanan+" Harganya Rp. 10.000 mantap pokoknya");
    }
}
