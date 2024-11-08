
public class HamburgerEstrutura implements Hamburger {

    public float preco;

    public HamburgerEstrutura() {
    }

    public HamburgerEstrutura(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getEstrutura() {
        return "Hamburger";
    }

}