
public class Presunto extends HamburgerEstilo {

    public Presunto(Hamburger hamburger) {
        super(hamburger);
    }

    public float getPercentualPreco() {
        return 25.0f;
    }

    public String getNomeEstrutura() {
        return "Presunto";
    }
}