package factorypattern.minuman;

public class TehTawar implements Minuman {
    private String namaMinuman = TehTawar.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.println(namaMinuman + " Rasanya hambar tapi cocok disajikan saat makan ");
    }
}
