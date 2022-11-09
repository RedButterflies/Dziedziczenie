public class Figura {
    protected double pole;
    protected double obwod;
    private class Color{};
    protected void rysuj()
    {
        System.out.println("Narysowalem figure");
    };
    protected void usun()
    {
        System.out.println("Usunalem figure");
    };
    protected void przesun()
    {
        System.out.println("Przesunalem figure");
    };
    protected String podajParametry()
    {
        String malyString= "Good morning";
        return malyString;
    };

    public Figura() {
        this.pole = 10;
        this.obwod = 3;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public Figura(int pole, int obwod) {
        this.pole = pole;
        this.obwod = obwod;
    }
}
