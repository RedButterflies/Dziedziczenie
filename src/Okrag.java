import java.util.Scanner;

public class Okrag extends Elipsa{

    public Okrag(double polosWielkaA, double polosMalaB, double x1, double y1, double x2, double y2, double c) {
        super(polosWielkaA, polosMalaB, x1, y1, x2, y2, c);
    }

    public Okrag(int pole, int obwod, double polosWielkaA, double polosMalaB, double x1, double y1, double x2, double y2, double c) {
        super(pole, obwod, polosWielkaA, polosMalaB, x1, y1, x2, y2, c);
    }
    private double promien;

    public Okrag(double polosWielkaA, double polosMalaB, double x1, double y1, double x2, double y2, double c, double promien) {
        super(polosWielkaA, polosMalaB, x1, y1, x2, y2, c);
        this.promien = promien;
    }

    public Okrag(int pole, int obwod, double polosWielkaA, double polosMalaB, double x1, double y1, double x2, double y2, double c, double promien) {
        super(pole, obwod, polosWielkaA, polosMalaB, x1, y1, x2, y2, c);
        this.promien = promien;
    }

    @Override
    protected void rysuj() {
        System.out.println("Rysuje okrag");
    }

    @Override
    protected void usun() {
        System.out.println("Usunelam okrag");
    }

    @Override
    protected void przesun() {
        System.out.println("Przesunelam okrag");
    }

    @Override
    protected String podajParametry() {
        System.out.println("Podaj parametr: ");
        String parametr;
        Scanner sc = new Scanner(System.in);
        parametr = sc.next().toString();
        System.out.println("Wprowadzono parametr: "+ parametr);
        return parametr;
    }
    public double obliczPole(Okrag a)
    {
        double pole = promien*promien*3.14;
        System.out.println("Pole okregu wynosi: "+ pole);
        a.pole= pole;
        return pole;

    }
    public double obliczObowod(Okrag a)
    {
        double obwod = promien*2*3.14;
        System.out.println("Obwod okregu wynosi: "+ obwod);
        a.obwod = obwod;
        return obwod;
    }

}
