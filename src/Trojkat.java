import java.util.Scanner;

public class Trojkat extends Wielokat{
    public Trojkat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
    }

    public Trojkat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
    }
    private double wysokoscH;
    private double podstawaA;

    public Trojkat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double wysokoscH, double podstawaA) {
        super(liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.wysokoscH = wysokoscH;
        this.podstawaA = podstawaA;
    }

    public Trojkat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych, double wysokoscH, double podstawaA) {
        super(pole, obwod, liczbaWierzcholkow, liczbaBokow, sumaKatowWewnetrznych);
        this.wysokoscH = wysokoscH;
        this.podstawaA = podstawaA;
    }

    @Override
    protected void rysuj() {
        System.out.println("Narysowalam trojkat");
    }

    @Override
    protected void usun() {
        System.out.println("Usunelam trojkat");
    }

    @Override
    protected void przesun() {
        System.out.println("Przesunelam trojkat");
    }

    @Override
    protected String podajParametry() {
        System.out.println("Podaj parametry: ");
        Scanner sc = new Scanner(System.in);
        String parametr;
        parametr= sc.next().toString();
        return parametr;
    }

    public void setWysokoscH(double wysokoscH) {
        this.wysokoscH = wysokoscH;
    }

    public void setPodstawaA(double podstawaA) {
        this.podstawaA = podstawaA;
    }

    public double obliczPole(Trojkat b)
    {
        double pole;
        pole= podstawaA*wysokoscH/2;
        b.pole=pole;
        System.out.println("Pole trojkata wynosi: " + pole);
        return pole;
    }
    public double obliczObwod(Trojkat b)
    {
        double obwod;
        double a1;
        double a2;
        double a3;
        System.out.println("Wprowadz bok1: ");
        Scanner bok1= new Scanner(System.in);
        a1= bok1.nextDouble();
        System.out.println("Wprowadz bok2: ");
        Scanner bok2= new Scanner(System.in);
        a2= bok2.nextDouble();
        System.out.println("Wprowadz bok3: ");
        Scanner bok3= new Scanner(System.in);
        a3= bok3.nextDouble();
        obwod= a1+a2+a3;
        b.obwod=obwod;
        System.out.println("Obowod trojkata wynosi: "+obwod);

        return obwod;

    }
}
