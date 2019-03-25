package abstrackfactory;

import factorypattern.makanan.Makanan;
import factorypattern.minuman.Minuman;

public abstract class AbstrackFactory {
    public abstract Makanan getMakanan(String makanan);
    public abstract Minuman getMinuman(String minuman);
}
