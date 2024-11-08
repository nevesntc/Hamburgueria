
public class Queijo extends HamburgerEstilo {

    public Queijo(Hamburger Hamburger) {
        super(hamburger);
    }

    public float getPercentualPreco() {
        return 25.0f;
    }

    public String getNomeEstrutura() {
        return "Queijo";
    }
}