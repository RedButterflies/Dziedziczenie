public class Main {
    public static void main(String[] args) {
        Elipsa elipsa = new Elipsa(7,3,6,9,12,18,24);
        Figura figura = new Figura(20,30);
        Kwadrat kwadrat = new Kwadrat(9,4,360,3);
        Okrag okrag = new Okrag(3,3,6,9,12,18,24,3);
        Prostokat prostokat = new Prostokat(4,4,360,4,5,3,4);
        Trojkat trojkat = new Trojkat(3,3,180);
        Wielokat wielokat = new Wielokat(4,4,360);


        System.out.println("Elipsa\n");
        elipsa.odlegloscOgniskOdSrodkaElipsy(24);
        elipsa.przesun();
        elipsa.rysuj();
        elipsa.podajParametry();
        elipsa.usun();

        System.out.println();
        System.out.println("Figura\n");
        figura.przesun();
        figura.rysuj();
        figura.usun();
        figura.podajParametry();

        System.out.println();
        System.out.println("Kwadrat\n");
        kwadrat.przesun();
        kwadrat.rysuj();
        kwadrat.usun();
        kwadrat.podajParametry();
        kwadrat.obliczObowod(kwadrat);
        kwadrat.obliczPole(kwadrat);

        System.out.println();
        System.out.println("Okrag\n");
        okrag.przesun();
        okrag.usun();
        okrag.rysuj();
        okrag.obliczObowod(okrag);
        okrag.obliczPole(okrag);
        okrag.podajParametry();


        System.out.println();
        System.out.println("Prostokat\n");
        prostokat.przesun();
        prostokat.usun();
        prostokat.rysuj();
        prostokat.podajParametry();
        prostokat.obliczObowod(prostokat);
        prostokat.obliczPole(prostokat);

        System.out.println();
        System.out.println("Trojkat\n");
        trojkat.przesun();
        trojkat.usun();
        trojkat.rysuj();
        trojkat.podajParametry();
        trojkat.obliczObwod(trojkat);
        trojkat.setPodstawaA(6);
        trojkat.setWysokoscH(8);
        trojkat.obliczPole(trojkat);

        System.out.println();
        System.out.println("Wielokat\n");
        wielokat.przesun();
        wielokat.usun();
        wielokat.rysuj();
        wielokat.podajParametry();
        wielokat.sumaKatowWewnetrznych(4);
    }
}