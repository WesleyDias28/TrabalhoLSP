package puc;

import static org.junit.Assert.assertTrue;

import org.joda.time.LocalDate;
import org.junit.Test;

public class ProdutosTest {
    @Test
    public void deveRetornarTrueParaAberturaMenorQueFehamento() {
        Produtos produto = new Produtos();

        Boolean produtoCadastrado = produto.cadastrarProdutos(1, "Arroz", 2.0, 3.0, LocalDate.now());

        assertTrue(produtoCadastrado);
    }


}
