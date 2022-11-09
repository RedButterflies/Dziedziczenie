import java.util.Scanner;

public class Prostokat extends Wielokat{
    public Prostokat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
    }

    public Prostokat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
    }
    private double bok1;
    private double bok2;

    public Prostokat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double bok1, double bok2) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public Prostokat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double bok1, double bok2) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    protected void rysuj() {
        System.out.println("Narysowalam prostokat");
    }

    @Override
    protected void usun() {
        System.out.println("Usunelam prostokat");
    }

    @Override
    protected void przesun() {
        System.out.println("Przesunelam prostokat");
    }

    @Override
    protected String podajParametry() {
        System.out.println("Podaj parametry: ");
        Scanner sc= new Scanner(System.in);
        String parametr= sc.next().toString();
        System.out.println("Wprowadzono parametr: "+ parametr);
        return parametr;


    }
    public double obliczObowod(Prostokat c)
    {
        double obwod;
        obwod=2*(bok1+bok2);
        System.out.println("Obwod prostokata wynosi: "+obwod);
        c.obwod=obwod;
        return obwod;


    }
    public double obliczPole(Prostokat c)
    {
        double pole;
        pole = bok1*bok2;
        System.out.println("Pole prostokata wynosi: "+pole);
        c.pole=pole;
        return pole;

    }

}
