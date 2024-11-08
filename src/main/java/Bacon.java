
public class Bacon extends HamburgerEstilo {

    public HamburgerEstilo(Hamburger hamburger) {
        super(hamburger);
    }

    public float getPercentualCargaHoraria() {
        return 25.0f;
    }

    public String getNomeEstrutura() {
        return "Bacon";
    }
}