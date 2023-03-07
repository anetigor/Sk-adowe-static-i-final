package packcage;

public class Sklep {
    protected String adres;
    protected float powierzchnia;
    protected String czy_wc;
    protected int czynsz;

        public Sklep(String adres, float powierzchnia, String czy_wc, int czynsz){
            this.adres = adres;
            this.powierzchnia = powierzchnia;
            this.czy_wc = czy_wc;
            this.czynsz = czynsz;
        }

        public void ToString(){
            System.out.println("Sklep pod adresem " + adres + " ma powierzchnię " + powierzchnia + ".\n Czy jest toaleta? " + czy_wc +  "\nCzynsz wynosi " + czynsz);
        }

        public void pulki(){
            System.out.println("Dzięki tej metodzie uda sie rozstawić " + (powierzchnia / 2) + " pułek");
        }
       public  final float cos(int miesiac ){
            return (czynsz * miesiac);
       }




}
