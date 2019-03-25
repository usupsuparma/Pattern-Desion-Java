package factorypattern.minuman;

public class TehManis implements Minuman {
    private String namaMinuman = TehManis.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.println(namaMinuman + " Rasanya manis tapi seger! ");
    }
}
