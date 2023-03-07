package drugi;
import packcage.Sklep;

public class Kwiaciarnia extends Sklep{
    public int pow_zaplecza;

    public Kwiaciarnia (String adres, float powierzchnia, String czy_wc, int czynsz, int pow_zaplecza){
        super(adres, powierzchnia, czy_wc, czynsz);
       this.pow_zaplecza = pow_zaplecza;
    }

    @Override
    public String toString() {
        return "powierzhcnia zaplecza to " + pow_zaplecza;
    }

    @Override
    public void pulki(){
        System.out.println("Dzięki tej metodzie uda sie rozstawić " + (powierzchnia / 4) + " pułek");

}
}
