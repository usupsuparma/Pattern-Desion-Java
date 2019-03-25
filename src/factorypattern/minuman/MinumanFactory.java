package factorypattern.minuman;

import abstrackfactory.AbstrackFactory;
import factorypattern.makanan.Makanan;

public  class MinumanFactory extends AbstrackFactory {
    @Override
    public Makanan getMakanan(String makanan) {
        return null;
    }

    @Override
    public  Minuman getMinuman(String jenisMinuman) {
        if (jenisMinuman.equals(JenisMinuman.TEH_HIJAU)) {
            return new TehHijau();
        } else if (jenisMinuman.equals(JenisMinuman.TEH_MANIS)) {
            return new TehManis();
        } else if (jenisMinuman.equals(JenisMinuman.TEH_TAWAR)) {
            return new TehTawar();
        }
        return null;
    }
}
