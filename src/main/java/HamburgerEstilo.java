
public abstract class HamburgerEstilo implements Hamburger {

    private Hamburger hamburger;
    public String estrutura;

    public HamburgerEstilo(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public HamburgerEstilo getHamburgerEstilo() {
        return HamburgerEstilo;
    }

    public void setHamburgerEstilo(HamburgerEstilo hamburgerestilo) {
        this.HamburgerEstio = hamburgerestilo;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.hamburgerestilo.getpreco() + this.getPreco();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.curso.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}

