package abstrackfactory;

import factorypattern.makanan.MakananFactory;
import factorypattern.minuman.MinumanFactory;

public class FactoryProduksi {
    public static final String PILIH_MAKANAN = "Memilih Makanan";
    public static final String PILIH_MINUMAN = "Memilih Minuman";

    public static AbstrackFactory getFactory(String pilihan) {
        if (pilihan.equals(PILIH_MAKANAN)) {
            return new MakananFactory();
        } else if (pilihan.equals(PILIH_MINUMAN)) {
            return new MinumanFactory();
        }
        return null;
    }
}
