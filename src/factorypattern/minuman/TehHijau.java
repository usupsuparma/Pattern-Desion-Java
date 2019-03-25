package factorypattern.minuman;

public class TehHijau implements Minuman {
    private String namaMinuman = TehHijau.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.println(namaMinuman + " Rasanya pahit tapi menyehatkan! ");
    }
}
