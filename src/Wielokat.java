import java.util.Scanner;

class Wielokat extends Figura{
    private int liczbaWierzcholkow;
    private int liczbaBokow;
    private double sumaKatowWewnetrznych;

    public Wielokat(int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        this.liczbaWierzcholkow = liczbaWierzcholkow;
        this.liczbaBokow = liczbaBokow;
        this.sumaKatowWewnetrznych = sumaKatowWewnetrznych;
    }

    public Wielokat(int pole, int obwod, int liczbaWierzcholkow, int liczbaBokow, double sumaKatowWewnetrznych) {
        super(pole, obwod);
        this.liczbaWierzcholkow = liczbaWierzcholkow;
        this.liczbaBokow = liczbaBokow;
        this.sumaKatowWewnetrznych = sumaKatowWewnetrznych;
    }

    public int getLiczbaWierzcholkow() {
        return liczbaWierzcholkow;
    }

    public void setLiczbaWierzcholkow(int liczbaWierzcholkow) {
        this.liczbaWierzcholkow = liczbaWierzcholkow;
    }

    public int getLiczbaBokow() {
        return liczbaBokow;
    }

    public void setLiczbaBokow(int liczbaBokow) {
        this.liczbaBokow = liczbaBokow;
    }

    public double getSumaKatowWewnetrznych() {
        return sumaKatowWewnetrznych;
    }

    public void setSumaKatowWewnetrznych(double sumaKatowWewnetrznych) {
        this.sumaKatowWewnetrznych = sumaKatowWewnetrznych;
    }

    @Override
    protected void rysuj() {
        System.out.println("Narysowalam wielokat");
    }

    @Override
    protected void usun() {
        System.out.println("Usunelam wielokat");
    }

    @Override
    protected void przesun() {
        System.out.println("Przesunelam wielokat");
    }

    @Override
    protected String podajParametry() {

        System.out.println("Podaj parametry wielokata: ");
        Scanner sc = new Scanner(System.in);
        String parametr;
        parametr= sc.next().toString();
        System.out.println("Wprowadzone parametry: "+ parametr);
        return parametr;
    }
    public double sumaKatowWewnetrznych(int liczbaBokow)
    {
        double suma = (liczbaBokow-2)* 180;
        System.out.println("Suma katow wewnetrznych wynosi: "+ suma);
        return suma;

    }
}
