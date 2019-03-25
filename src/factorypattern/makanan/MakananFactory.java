package factorypattern.makanan;

import abstrackfactory.AbstrackFactory;
import factorypattern.minuman.Minuman;

public class MakananFactory extends AbstrackFactory {

    @Override
    public Makanan getMakanan(String makanan) {
        if (makanan.equals(JenisMakanan.NASI_GORENG)) {
            return new NasiGoreng();
        } else if (makanan.equals(JenisMakanan.NASI_PADANG)) {
            return new NasiPadang();
        } else if (makanan.equals(JenisMakanan.NASI_UDUK)) {
            return new NasiUduk();
        }
        return null;
    }

    @Override
    public Minuman getMinuman(String minuman) {
        return null;
    }
}
