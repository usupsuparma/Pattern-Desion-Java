import abstrackfactory.AbstrackFactory;
import abstrackfactory.FactoryProduksi;
import factorypattern.makanan.JenisMakanan;
import factorypattern.makanan.Makanan;
import factorypattern.minuman.JenisMinuman;
import factorypattern.minuman.Minuman;
import factorypattern.minuman.MinumanFactory;

public class Main {
    public static void main(String[] args) {

//        Singleton test = Singleton.getInstance();
//        test.testMethod();
//        Singleton.testMethod();

//        Minuman order = MinumanFactory.getMinuman(JenisMinuman.TEH_HIJAU);
//        order.rasa();

        AbstrackFactory makananFactory = FactoryProduksi.getFactory(FactoryProduksi.PILIH_MAKANAN);
        Makanan order1 = makananFactory.getMakanan(JenisMakanan.NASI_GORENG);
        order1.harga();
        Makanan order2 = makananFactory.getMakanan(JenisMakanan.NASI_UDUK);
        order2.harga();

        AbstrackFactory minumanFactory = FactoryProduksi.getFactory(FactoryProduksi.PILIH_MINUMAN);
        Minuman order3 = minumanFactory.getMinuman(JenisMinuman.TEH_HIJAU);
        order3.rasa();
    }
}
