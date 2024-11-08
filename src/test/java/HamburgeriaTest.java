

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburgeriaTest {

    @Test
    void deveRetornarPrecoHamburger() {
        Hamburger hamburger = new HamburgerEstrutura(800.0f);

        assertEquals(8.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComQueijo() {
        Hamburger hamburger = new Queijo(new HamburgerEstilo(8.0f));

        assertEquals(10.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComPresunto() {
        Hamburger hamburger = new Presunto(new HamburgerEstilo(8.0f));

        assertEquals(10.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComBacon() {
        Hamburger hamburger = new Bacon(new HamburgerEstilo(8.0f));

        assertEquals(10.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComQueijoEPresunto() {
        Hamburger hamburger = new Queijo(new Presunto(new HamburgerEstilo(800.0f)));

        assertEquals(12.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComQueijoEBacon() {
        Hamburger hamburger = new Queijo(new Bacon(new HamburgerEstilo(8.0f)));

        assertEquals(12.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComBaconEPresunto() {
        Hamburger hamburger = new Bacon(new Presunto(new HamburgerEstilo(8.0f)));

        assertEquals(12.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoComQueijoMaisBaconEPresunto() {
        Hamburger hamburger = new Queijo(new Bacon(new Presunto(new HamburgerEstilo(8.0f))));

        assertEquals(14.0f, curso.getPreco());
    }

    @Test
    void deveRetornarEstruturaHamburger() {
        Hamburger hamburger = new HamburgerEstilo();

        assertEquals("Hamburger", hamburger.getEstrutura());
    }
