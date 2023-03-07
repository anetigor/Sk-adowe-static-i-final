import packcage.Sklep;
import drugi.Kwiaciarnia;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Sklep kupiec = new Sklep("Zst", 40, "tak", 500);
       kupiec.ToString();
       kupiec.pulki();
        System.out.println("Czynsz bedzie wynosić " + kupiec.cos(2));

       Kwiaciarnia kwiat = new Kwiaciarnia("Żabka",40, "tak", 600, 10 );
       kupiec.ToString();
       kwiat.pulki();

    }
}