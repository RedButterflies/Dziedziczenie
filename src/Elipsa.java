import java.util.Scanner;
import java.math.*;

import static java.lang.Math.sqrt;

class Elipsa extends Figura{
    private double polosWielkaA;
    private double polosMalaB;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double c;

    public Elipsa(double polosWielkaA, double polosMalaB, double x1, double y1, double x2, double y2, double c) {
        this.polosWielkaA = polosWielkaA;
        this.polosMalaB = polosMalaB;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.c = c;
    }

    public Elipsa(int pole, int obwod, double polosWielkaA, double polosMalaB, double x1, double y1, double x2, double y2, double c) {
        super(pole, obwod);
        this.polosWielkaA = polosWielkaA;
        this.polosMalaB = polosMalaB;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.c = c;
    }

    public double getPolosWielkaA() {
        return polosWielkaA;
    }

    public void setPolosWielkaA(double polosWielkaA) {
        this.polosWielkaA = polosWielkaA;
    }

    public double getPolosMalaB() {
        return polosMalaB;
    }

    public void setPolosMalaB(double polosMalaB) {
        this.polosMalaB = polosMalaB;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    protected void rysuj() {
        System.out.println("Narysowalam Elipse");
    }

    @Override
    protected void usun() {
        System.out.println("Usunelam Elipse");
    }

    @Override
    protected void przesun() {
        System.out.println("Przesunelam Elipse");
    }

    @Override
    protected String podajParametry() {
        System.out.println("Podaj parametr: ");
        Scanner sc= new Scanner(System.in);
        String parametr = sc.next().toString();
        System.out.println("Podano parametr Elipsy: "+ parametr);
        return parametr;


    }
    public double odlegloscOgniskOdSrodkaElipsy(double c)
    {
        double odleglosc;
        double roznicaKwadratow;
        roznicaKwadratow = sqrt(polosWielkaA*polosWielkaA - polosMalaB*polosMalaB);
        odleglosc = sqrt(roznicaKwadratow);
        System.out.println("Odleglosc ognisk od srodka elipsy wynosi:  "+ odleglosc);
        return odleglosc;

    }


}
