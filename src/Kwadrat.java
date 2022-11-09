import java.util.Scanner;

public class Kwadrat extends Prostokat{
    public Kwadrat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
    }

    public Kwadrat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
    }
    private double bokKwadratu;

    public Kwadrat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double bokKwadratu) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.bokKwadratu = bokKwadratu;
    }

    public Kwadrat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double bokKwadratu) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.bokKwadratu = bokKwadratu;
    }

    public Kwadrat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double bok1, double bok2, double bokKwadratu) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych, bok1, bok2);
        this.bokKwadratu = bokKwadratu;
    }

    public Kwadrat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double bok1, double bok2, double bokKwadratu) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych, bok1, bok2);
        this.bokKwadratu = bokKwadratu;
    }

    @Override
    protected void rysuj() {
        System.out.println("Narysowalam kwadrat");
    }

    @Override
    protected void usun() {
        System.out.println("Usunelam kwadrat");
    }

    @Override
    protected void przesun() {
        System.out.println("Przesunelam kwadrat");
    }

    @Override
    protected String podajParametry() {
        System.out.println("Podaj parametry: ");
        Scanner sc = new Scanner(System.in);
        String parametr =sc.next().toString();
        System.out.println("Wprowadzony parametr: "+ parametr);
        return parametr;
    }

    public double obliczObowod(Kwadrat x)
    {
        double obwod= bokKwadratu*4;
        System.out.println("Obwod kwadratu wynosi: "+ obwod);
        x.obwod=obwod;
        return obwod;
    }
    public double obliczPole(Kwadrat y)
    {

        double pole = bokKwadratu*bokKwadratu;
        System.out.println("Pole kwadratu wynosi: "+pole);
        y.pole= pole;
        return pole;
    }
}
