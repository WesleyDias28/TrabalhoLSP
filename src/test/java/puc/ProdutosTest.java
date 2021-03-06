package puc;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class ProdutosTest {
    @Test
    public void deveRetornarTrueParaProdutoCadastrado() {
        Produtos produto = new Produtos(1, "Arroz", 2.0, 3.0, LocalDate.now());

        assertEquals("Codigo numero:", 1, produto.getid(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoParaPrecoZerado() {
        Produtos produto = new Produtos(1, "Arroz", 0.0, 0.0, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoParaDataNula() {
        Produtos produto = new Produtos(1, "Arroz", 2.0, 3.0, null);
    }

}
